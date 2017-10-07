class ParserException extends Exception{
    String errStr;

    public ParserException(String err){
        errStr=err;
    }

    public String toString(){
        return errStr;
        }
}

class Parser{
    //These are the token type
    final int NONE = 0 ;
    final int DELINMITER = 1;
    final int VARIABLE = 2;
    final int NUMBER = 3;

    //这是错误类型
    final int SYNTAX = 1;
    final int UNBALPARENS = 1;
    final int NOEXP = 2;
    final int DIVBYZERO = 3;

    //这是表达示结束标志
    final String EOF="\0";

    private String exp;     //refers to expression string
    private int expIdx;     //current index into the expression
    private String token;   //holds current token
    private int tokeType;   //holds token's type

    //程序开始点
    public double evaluate(String expstr) throws ParserException{
        double result; exp = expstr;
        expIdx = 0;

        getToken();
        if(token.equals(EOF))
            handleErr(NOEXP); //没有表达示

        result = evalExp2();
        if(!token.equals(EOF))  //最后一个字符必须是ＥＯＦ
            handleErr(SYNTAX);
        return result;
    }

    //加法和减法计算
    private double evalExp2() throws ParserException{
        double result;
        char op;
        double partialResult;

        result = evalExp3();

        while((op = token.charAt(0)) == '+' || op == '-'){
            getToken();

            partialResult = evalExp3();
            switch(op){
                case '-':
                    result = result - partialResult;
                    break;
                case '+':
                    result = result + partialResult;
                    break;
               }
        }
        return result;
    }

    //乘法和除法取余计算
    private double evalExp3()throws ParserException{
        char op;
        double result;
        double partialResult;

        result = evalExp4();

        while((op = token.charAt(0)) == '*' || op == '/' || op == '%'){
            getToken();

            partialResult = evalExp4();

            switch(op){
                case '*':
                    result *= partialResult;
                    break;
                case '/':
                    result /= partialResult;
                    break;
                case '%':
                    result %= partialResult;
                    break;
            }
        }
        return result;
    }

    private double evalExp4()throws ParserException{
        double result;
        double partialResult;
        double ex;
        int t;

        result = evalExp5();

        if(token.equals('^')){
            getToken();

            partialResult = evalExp4();
            ex = result;
            if(partialResult == 0.0)
                result = 1.0;
            else{
                for(t=(int)partialResult-1;t>0;t--)
                    result*=ex;
            }
        }
        return result;
    }

    //正负号计算
    private double evalExp5()throws ParserException{
        double result;
        String op;

        op="";
        if((tokeType == DELINMITER) && token.equals("+") || token.equals("-"))
        {
            op = token;
            getToken();
        }
        result = evalExp6();
        if(op.equals("-")) result = -result;
                return result;
    }

    private double evalExp6()throws ParserException{
        double result;

        if(token.equals("(")){
            getToken();
            result = evalExp2();
            if(!token.equals(")"))
                handleErr(UNBALPARENS);
            getToken();
        }
        else result = atom();

        return result;
    }

    private double atom()throws ParserException{
        double result = 0.0;

        switch(tokeType){
            case NUMBER:
                try{
                    result = Double.parseDouble(token);
                }
                catch(NumberFormatException exc){
                    handleErr(SYNTAX);
                }
                getToken();
                break;
            default:
                handleErr(SYNTAX);
                break;
        }

        return result;
    }

    //handle an error 
    private void handleErr(int error) throws ParserException{
        String[] err = {
            "Syntax Error","Unbalanced Parentheses","no Expression Present","Division by Zero"};
        throw new ParserException(err[error]);
    }


    private void getToken(){
        tokeType = NONE;
        token = "";


        if(expIdx == exp.length()){
            token = EOF;
            return;
        }

        while(expIdx < exp.length() && Character.isWhitespace(exp.charAt(expIdx))) ++expIdx;
        if(expIdx == exp.length()){
            token = EOF;
            return;
        }

        if(isDelim(exp.charAt(expIdx))){
            token += exp.charAt(expIdx);
            expIdx++;
            tokeType = DELINMITER;
        }
        else if(Character.isLetter(exp.charAt(expIdx))){
            while(!isDelim(exp.charAt(expIdx))){
                token += exp.charAt(expIdx);
                expIdx++;
                if(expIdx >= exp.length()) break;
            }tokeType = VARIABLE;
        }
        else if(Character.isDigit(exp.charAt(expIdx))){
            while(!isDelim(exp.charAt(expIdx))){
                token += exp.charAt(expIdx);
                expIdx++;
                if(expIdx >= exp.length()) break;
            }
            tokeType = NUMBER;
        }
        else{
            token = EOF;
            return;
        }
    }

    public boolean isDelim(char c){
        if(("+-/*%^=()".indexOf(c) != -1))
            return true;
        return false;
    }
}
