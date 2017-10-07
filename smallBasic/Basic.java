//一个小的basic解释器


import java.io.*;
import java.util.*;

class interPreterException extends Exception{
    String errstr;

    public interPreterException(String err){
        errstr = err;
    }
}

class SBasic{
    final int PROG_SIZE = 10000;   //程序长度最大值
    //标识类型
    final int NONE = 0;
    final int DILIMITER = 1;
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
    final int NEXT = 5;
    final int TO = 6;
    final int GOTO = 7;
    final int GOSUB = 8;
    final int RETRN = 9;
    final int END = 10;
    final int EOL = 11;

    //命令行结束标识
    final String EOF = "\0";

    //比较符号
    final char LE = 1;
    final char GE = 2;
    final char NE = 3;

    //变量数组
    private double var[];

    //关键字解释类
    class Keyword{
        String keyword;
        int keyWordTok;
        
        Keyword(String str,int t){
            keyword = str;
            keyWordTok = t;
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
    private int tikType;

    private int kwToken;

    class ForInfo{
        int var;
        double target;
        int loc;
    }

    //Stack for For loops.
    private stack fStack;

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
    private TReeMap labelTable ;
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
        sise = loadProgram(tempbuf,progName);
        if(size != -1){
            //creat a properly sized array to hold the program.
            prog = new char[size];
            //copy the program into program array.
            System.arraycopy(tempbuf,0,prog,0,size);
        }
    }

    private int loadProgram(char[] p,String name)throws InterPreterException{
        int size=0;

        try{
            FileReader fr = new FileReader(fname);

            BufferedReader br = new BufferedReader(fr);
            size = br.read(p,0,PROG_SIZE);
            fr.close(0);
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
        vars = neew double[26];
        fStack = new Stack();
        labelTable = new TreeMap();
        gStack = new Stack();
        progIdx = 0;

        scanLabels(); // 找到程序中的标签

        sbInterp(); //执行

    }

    //程序进去点
    private void sbInterp() throws InterpreterException{
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
        }while(!token.equals(EOF));
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
         if(kwTable != EOL) findEOL();
     }
     while(!token.equals(FOP));
     progIdx = 0 ;
    }

    // find the start of the next line.
    /public void findEOL(){
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
        if(!token.equals("="){
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
    private void print(){
        double result;
        int len = 0,space;
        String lastDelim == "";

        do{
            getToken();
            if(kwTable == EOL || token.equals(EOP)) break;
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
            if(lastDelim.equals(","){
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
        if(!kwToken==EOL||token.equals(EOP)){
            if(!lastDelim.equals(";")||!lastDelim.equals(","))
                System.out.println();
        }
        else handleErr(SYNTAX);
    }

    //Excute a GOTO statement.


