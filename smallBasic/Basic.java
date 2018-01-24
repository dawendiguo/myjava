import java.io.*;
import java.util.*;

class InterpreterException extends Exception{
    String errstr;

    public InterpreterException(String err){
        errstr = err;
    }
    public String toString(){
    return errstr;
    }
}

class SBasic{
    final int PROG_SIZE = 10000;   //程序长度最大值
    //标识类型
    final int NONE = 0;
    final int DELIMITER = 1;
    final int VARIABLE = 2;
    final int NUMBER = 3;
    final int COMMAND = 4;
    final int QUOTEDSTR = 5;

    //错误类型
    final int SYNTAX = 0;
    final int UNBALPARENTS = 1;
    final int NOEXP = 2;
    final int DIVBYZERO = 3;
    final int EQUALEXPECTED = 4;
    final int NOTVAR = 5;
    final int LABLETABLEFULL = 6;
    final int DUPLABLE = 7;
    final int UNDEFLABLE = 8;
    final int THENEXPECTED = 9;
    final int TOEXPECTED = 10;
    final int NEXTWITHOUTFOR = 11;
    final int RETURNWITHOUTGOSUB = 12;
    final int MISSINGQUOTE = 13;
    final int FILENOTFOUND = 14;
    final int FILEIOERROR = 15;
    final int INPUTIOERROR = 16;

    //关键字
    final int UNKNCOM = 0;
    final int PRINT = 1;
    final int INPUT = 2;
    final int IF = 3;
    final int THEN = 4;
    final int FOR = 5; 
    final int NEXT = 6;
    final int TO = 7;
    final int GOTO = 8;
    final int GOSUB = 9;
    final int RETURN = 10;
    final int END = 11;
    final int EOL = 12;

    //命令行结束标识
    final String EOP = "\0";

    //比较符号
    final char LE = 1;
    final char GE = 2;
    final char NE = 3;

    //变量数组
    private double vars[];

    //关键字解释类
    class Keyword{
        String keyword;
        int keywordTok;
        
        Keyword(String str,int t){
            keyword = str;
            keywordTok = t;
        }
    }
    
    Keyword kwTable[] ={
        new Keyword("print",PRINT),
        new Keyword("input",INPUT),
        new Keyword("lf",IF),
        new Keyword("then",THEN),
        new Keyword("goto",GOTO),
        new Keyword("for",FOR),
        new Keyword("next",NEXT),
        new Keyword("to",TO),
        new Keyword("gosub",GOSUB),
        new Keyword("return",RETURN),
        new Keyword("end",END)
    };
    private char[] prog;
    private int progIdx;

    private String token;
    private int tokType;

    private int kwToken;

    class ForInfor{
        int var;
        double target;
        int loc;
    }

    //Stack for For loops.
    private Stack fStack;

    //Defines label table entries.
    class label{
        String name;
        int loc;
        public label (String n,int i){
            name =n;
            loc = i;
        }
    }

    //A map for labels 
    private TreeMap labelTable ;
    //Stack for gosubs .
    private Stack gStack;

    //Relational operators.
    char rops[] ={
        GE,NE,LE,'<','>','=',0};

    /*Create a String containing the relational 
      operators in order to make checking for 
      them more convenient.*/
    String relops = new String(rops);

    //Constructor for Sbasic.
    public SBasic(String progName)throws InterpreterException{
        char tempbuf[] = new char[PROG_SIZE];
        int size;

        //load the program to execute.
        size = loadProgram(tempbuf,progName);
        if(size != -1){
            //creat a properly sized array to hold the program.
            prog = new char[size];
            //copy the program into program array.
            System.arraycopy(tempbuf,0,prog,0,size);
        }
    }

    private int loadProgram(char[] p,String name)throws InterpreterException{
        int size=0;

        try{
            FileReader fr = new FileReader(name);

            BufferedReader br = new BufferedReader(fr);
            size = br.read(p,0,PROG_SIZE);
            fr.close();
        }catch(FileNotFoundException exc){
            handleErr(FILENOTFOUND);
            }
        catch(IOException exc){
            handleErr(FILEIOERROR);
        }

        //If file ends with an EOF mark , back pu.
        if(p[size-1] == (char) 26) size--;

        return size;
    }

    //执行程序
    public void run() throws InterpreterException{
        //Initialize for new Program run.
        vars = new double[26];
        fStack = new Stack();
        labelTable = new TreeMap();
        gStack = new Stack();
        progIdx = 0;

        scanLabels(); // 找到程序中的标签

        sbInterP(); //执行

    }

    //程序进去点
    private void sbInterP() throws InterpreterException{
        //这是主循环
        do{
            getToken();
            //Check for assignment statement.
            if(tokType == VARIABLE){
                putBack();
                assignment();
            }
            else //is keyword
              switch(kwToken){
                  case PRINT:
                      print();
                      break;
                  case GOTO:
                      execGoto();
                      break;
                  case IF:
                      execIf();
                      break;
                  case FOR:
                      execFor();
                      break;
                  case NEXT:
                      next();
                      break;
                  case INPUT:
                      input();
                      break;
                  case GOSUB:
                      gosub();
                      break;
                  case RETURN:
                      greturn();
                      break;
                  case END:
                      return;
              }
        }while(!token.equals(EOP));
    }

    //Find all labels
    //
    private void scanLabels()throws InterpreterException{
        int i ;
        Object result;
       //See if the first token in the file is a label.
       getToken();
     if(tokType==NUMBER)
          labelTable.put(token,new Integer(progIdx));
     findEOL();
     do{
         getToken();
         if(tokType == NUMBER){
             result = labelTable.put(token,new Integer(progIdx));

         if(result != null)
             handleErr(DUPLABLE);
         }

         //If not on a blank line , find next line.
         if(kwToken != EOL) findEOL();
     }
     while(!token.equals(EOP));
     progIdx = 0 ;
    }

    // find the start of the next line.
    public void findEOL(){
        while(progIdx < prog.length && prog[progIdx] != '\n' ) ++progIdx;

        if(progIdx < prog.length)
            progIdx++;
    }

    //Assign a variable a value.
    private void assignment() throws InterpreterException{
        int var ;
        double value;
        char vname;

        //Get the variable name.
        getToken();
        vname = token.charAt(0);

        if(!Character.isLetter(vname)){
            handleErr(NOTVAR);
            return;
        }

        //Convert to index into variable table.
        var = (int) Character.toUpperCase(vname) -'A';

        //Get the equals sign.
        getToken();
        if(!token.equals("=")){
            handleErr(EQUALEXPECTED);
            return;
        }

        //Get the value to assign.
        value = evaluate();


        //Assign the value.
        vars[var] = value;
    }


    //Execute a simple version of the PRINT statement.
    //
    private void print()throws InterpreterException{
        double result;
        int len = 0,spaces;
        String lastDelim = "";

        do{
            getToken();
            if(kwToken == EOL || token.equals(EOP)) break;
            if(tokType == QUOTEDSTR){   //Is String
                System.out.print(token);
                len += token.length();
                getToken();
            }
            else {  //is expression
                putBack();
                result = evaluate();
                getToken();
                System.out.print(result);

                //Add length of output to runing total.
                Double t = new Double(result);
                len += t.toString().length();
            }
            lastDelim = token;

            //If comma , move to next tab stop.
            if(lastDelim.equals(",")){
                //compute number of spaces to move tab
                spaces = 8 - (len % 8);
                len += spaces; //add int the tabbing position
                while(spaces != 0){
                    System.out.print(" ");
                    spaces--;
                }
            }
            else if(token.equals(";")){
                System.out.print(" ");
                len++;
            }
            else if (kwToken != EOL && !token.equals(EOP))
            handleErr(SYNTAX);
        }while(lastDelim.equals(";")||lastDelim.equals(","));
        if(kwToken==EOL||token.equals(EOP)){
            if(!lastDelim.equals(";")||!lastDelim.equals(","))
                System.out.println();
        }
        else handleErr(SYNTAX);
    }

    //Excute a GOTO statement.

    private void execGoto()throws InterpreterException{
    Integer loc;
    
    //Find the location of the lable
    loc = (Integer) labelTable.get(token);
    if(loc == null) 
        handleErr(UNDEFLABLE); 
    else //  start programe at the loc
    progIdx=loc.intValue();
    }

    //If statement programe
    private void execIf() throws InterpreterException{
    double result;
    result = evaluate();
    
    /*如果条件是真,执行if后面的语句
     */
    if(result != 0.0){
    getToken();
    if(kwToken != THEN){
    handleErr(THENEXPECTED);
    return;}
    }
    else findEOL();
    }

    //执行for语句
    private void execFor()throws InterpreterException{
    ForInfor stckvar=new ForInfor();
    double value;
    char vname;
    
    getToken(); //read the control variable
    vname= token.charAt(0);
    if(!Character.isLetter(vname)){
    handleErr(NOTVAR);
    return ;
    }
    
    //Save index of control var.
    stckvar.var = Character.toUpperCase(vname) - 'A';
    
    getToken(); //read the equal sign
    if(token.charAt(0) != '='){
    handleErr(EQUALEXPECTED);
    return ;
    }
    value = evaluate(); //get initial value
    vars[stckvar.var]=value;
    getToken(); //read and discard the TO
    if(kwToken != TO){
    handleErr(TOEXPECTED);
    }
    stckvar.target=evaluate(); //get target value

    /* If loop can execte at least once;
     ,push info on stack.*/
    if( value >= vars[stckvar.var]){
        stckvar.loc=progIdx;
        fStack.push(stckvar);
    }
    else //otherwise , skip loop code altogether 
        while(kwToken != NEXT) getToken();
    }

    //Execute a NEXT statement.
    private void next() throws InterpreterException
    {
        ForInfor stckvar;
        try{
            //Retrieve info for this  For loop
            stckvar = (ForInfor) fStack.pop();
            vars[stckvar.var]++;    //increment control var
            //If done return.
            if(vars[stckvar.var] > stckvar.target) return ;
            //Otherwise, restore the info.
            fStack.push(stckvar);
            progIdx = stckvar.loc; //loop
        }
        catch(EmptyStackException exc){
            handleErr(NEXTWITHOUTFOR);
        }
    }

    private void input() throws InterpreterException{
        int var;
        double val = 0.0;
        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        getToken(); //see if prompt string is present
        if(tokType == QUOTEDSTR){
            //if so, print it and check for comma 
            System.out.print(token);
            getToken();
            if(!token.equals(",")) handleErr(SYNTAX);
            getToken();
        }else System.out.print("? "); //otherwise ,prompt with ?

        //get the input var 
        var = Character.toUpperCase(token.charAt(0)) - 'A';

        try{
            str = br.readLine();
            val = Double.parseDouble(str); //read the value
        }catch(IOException exc){
            //You might wish to hand this error
            System.out.println("Invalid input.");
        }
        vars[var] = val; //store it
    }

    //Execute a GOSUB.
    private void gosub() throws InterpreterException{
        Integer loc;
        
        getToken();
        
        
        //Find the label to call.
        loc = (Integer) labelTable.get(token);
        
        if(loc == null)
            handleErr(UNDEFLABLE); //label not defined 
        else{
            //Save place to  return to.
            gStack.push(new Integer(progIdx));
            
            //strt program running at that loc.
            progIdx = loc.intValue();
        }
    }
    
    //Return from GOSUB
    private void greturn() throws  InterpreterException{
        Integer t;
        try{
            //Restore program index.
            t= (Integer)gStack.pop();
            progIdx = t.intValue();
        }
        catch(EmptyStackException exc){
            handleErr(RETURNWITHOUTGOSUB);
        }

    }

    //*************** Expression Parser *****************************/
    //Parser entry point 
    private double evaluate() throws InterpreterException{
        double result = 0.0;

        getToken();
        if(token.equals(EOP))
            handleErr(NOEXP); //no expression present
        //Parse and evaluate the expression.
        //
        result = evalExp1();
        putBack();

        return result;
    }

    //Process relational operators.
    private double evalExp1() throws InterpreterException{
        double temp_1, temp_r, result;
        char op;
        result = evalExp2();
        //If at end of program, return .
        if(token.equals(EOP)) return result;
           
        op = token.charAt(0);

        if(isRelop(op)){
            temp_1 = result;
            getToken();
            temp_r = evalExp1();
            switch(op){
                case '<':
                    if(temp_1 < temp_r) result = 1.0;
                    else result = 0.0;
                    break;
                case LE:
                    if(temp_1 <= temp_r) result = 1.0;
                    else result = 0.0;
                    break;
                case '>':
                    if(temp_1 > temp_r) result = 1.0;
                    else result = 0.0;
                    break;
                case GE:
                    if(temp_1 >= temp_r) result = 1.0;
                    else result = 0.0;
                    break;
                case '=':
                    if(temp_1 == temp_r) result = 1.0;
                    else result = 0.0;
                    break;
                case NE:
                    if(temp_1 != temp_r) result = 1.0;
                    else result = 0.0;
                    break;
            }
        }
        return result;
    }
    //Add or subtract two terms.

    private double evalExp2() throws InterpreterException{
        char op;
        double result;
        double particalResult;

        result = evalExp3();

        while((op = token.charAt(0)) == '+' || op == '-'){
            getToken();
            particalResult = evalExp3();
            switch(op){
                case '+':
                    result = result + particalResult;
                    break;
                case '-':
                    result = result - particalResult;
                    break;
            }
        }
        return result;
    }

    //Multiply or divide tow factors.
    private double evalExp3() throws InterpreterException{
        char op;
        double result;
        double particalResult;
        
        result = evalExp4();

        while((op = token.charAt(0) ) == '*' || op == '/' || op == '%'){
            getToken();
            particalResult = evalExp4();
            switch(op){
                case '*':
                    result = result * particalResult;
                    break;
                case '/':
                    if(particalResult == 0.0){
                        handleErr(DIVBYZERO);
                    }
                    result = result / particalResult;
                    break;
                case '%':
                    if(particalResult == 0.0)
                        handleErr(DIVBYZERO);
                    result = result % particalResult;
                    break;
            }
        }
        return result;
    }

    //Process an exponent
    private double evalExp4() throws InterpreterException{
        double result ;
        double particalResult;
        double ex;
        int t;

        result = evalExp5();
        if(token.equals("^")){
            getToken();
            particalResult = evalExp4();
            ex = result;
            if(particalResult == 0.0){
                result = 1.0;
            }
            else
                for(t=(int)particalResult-1;t>0;t--)
                    result = result * ex;
        }
        return result;
    }

    //Evaluate a unary + or -
    private double evalExp5() throws InterpreterException{
        double result;
        String op;

        op="";
        if((tokType == DELIMITER) && token.equals("+") || token.equals("-")){
            op = token;
            getToken();
        }
        result = evalExp6();

        if(op.equals("-")) 
            result = -result;
        return result;
    }

    //Process a parenthesized expression.
    private double evalExp6() throws InterpreterException{
        double result;

        if(token.equals("(")){
            getToken();
            result = evalExp2();
            if(!token.equals(")"))
                handleErr(UNBALPARENTS);
            getToken();
        }
        else 
            result = atom();
        return result;
    }

    //Get the value of a number or variable
    private double atom() throws InterpreterException{
        double result=0.0;

        switch(tokType){
            case NUMBER:
                try{
                    result = Double.parseDouble(token);
                }
                catch(NumberFormatException exc){
                    handleErr(SYNTAX);
                }
                getToken();
                break;
            case VARIABLE:
                result  = findVar(token);
                getToken();
                break;

            default:
                handleErr(SYNTAX);
                break;
        }

        return result;
    }
    private double findVar(String vname) throws InterpreterException{
        if(!Character.isLetter(vname.charAt(0))){
            handleErr(SYNTAX);
            return 0.0;
        }
        return vars[Character.toUpperCase(vname.charAt(0)) - 'A'];
    }

    //Return a token to the input stream.
    private void putBack(){
        if(token == EOP) return ;
        for(int i = 0 ;i < token.length(); i++) progIdx--;
    }

    //Handle a error
    private void handleErr(int error) throws InterpreterException{
        String[] err = {
            "Syntax Error",
            "Unbalanced Parentheses",
            "No Expression Present",
            "Divisio by Zero",
            "Equl sign expected",
            "Not a Variable",
            "Label table full",
            "Duplicate label",
            "Undefined label",
            "THEN expected",
            "TO expected",
            "NEXT without FOR",
            "RETURN without GOSUB",
            "Closing quotes needed",
            "File not found",
            "I/O error while loading File",
            "I/O error on INPUT statement"
        };

        throw new InterpreterException(err[error]);
       }
     private void getToken() throws InterpreterException{
         char ch;
         tokType = NONE;
         token = "";
         kwToken = UNKNCOM;

         //check for end of program
         if(progIdx == prog.length){
             token = EOP;
             return;
         }

         //skip over white space.
         while(progIdx < prog.length && isSpaceOrTab(prog[progIdx])) progIdx++;
         if(progIdx == prog.length){
             token = EOP;
             tokType = DELIMITER;
             return;
         }

         if(prog[progIdx] == '\r'){    //handle crlf
             progIdx += 2;
             kwToken = EOL;
             token = "\r\n";
             return;
         }

         //Check for relational operator.
         ch = prog[progIdx];
         if(ch == '<' || ch == '>'){
             if(progIdx+1 == prog.length) handleErr(SYNTAX);
             switch(ch){
                 case '<':
                     if(prog[progIdx+1] == '>'){
                         progIdx += 2;
                         token = String.valueOf(NE);
                     }
                     else if(prog[progIdx] == '='){
                         progIdx += 2;
                         token = String.valueOf(LE);
                     }
                     else{
                         progIdx++;
                         token = "<";
                     }
                     break;
                 case '>':
                     if(prog[progIdx+1] == '='){
                         progIdx += 2;
                         token = String.valueOf(GE);
                     }
                     else{
                        progIdx++;
                        token = ">";
                     }
                     break;
             }
             tokType = DELIMITER;
             return;
         }
         if(isDelim(prog[progIdx])){
             //is a operator.
             token  += prog[progIdx];
             progIdx++;
             tokType = DELIMITER;
         }

         else if(Character.isLetter(prog[progIdx])){
             //is a variable or keyword.
             while(!isDelim(prog[progIdx])){
                 token += prog[progIdx];
                 progIdx++;
                 if(progIdx >= prog.length) break;
             }
             kwToken = lookUp(token);
             if(kwToken == UNKNCOM) tokType = VARIABLE;
             else tokType = COMMAND;
         }
         else if(Character.isDigit(prog[progIdx])){
             // is a number
             while (!isDelim(prog[progIdx])){
                 token += prog[progIdx];
                 progIdx++;
                 if(progIdx >= prog.length) break;
             }
             tokType = NUMBER;
         }
         else if(prog[progIdx] == '"'){
             // is a quoted string.
             progIdx++;
             ch = prog[progIdx];
             while(ch != '"' && ch != '\r'){
                 token += ch;
                 progIdx++;
                 ch = prog[progIdx];
             }
             if(ch == '\r')  handleErr(MISSINGQUOTE);
             progIdx++;
             tokType = QUOTEDSTR;
         }
         else
         {
             //unknown character terminates program
             token = EOP;
             return;
         }
     }

     //Retrun true if c is a delimiter.
     private boolean isDelim(char c){
         if((" \r,;<>+-/%*^=()".indexOf(c) != -1))
             return true;
         return false;
     }
     //空格或者tab
     private boolean isSpaceOrTab( char c){
     if(c==' '|| c=='\t') return true;
     return false;
     }

     //Return true if c is a relational operator.
     boolean isRelop(char c){
         if(relops.indexOf(c) != -1) return true;
         return false;
     }

     /* look up a token's internal representation in the token tabel. */
     private int lookUp(String a){
         int i ;
         //Covert to lowercase.
         a = a.toLowerCase();
         //see if token is in table.
         for(i = 0 ;i < kwTable.length;i++)
             if(kwTable[i].keyword.equals(a))
                 return kwTable[i].keywordTok;
             return UNKNCOM;
     }
}
