package test;
class ParserException extends Exception{
    String errStr;

    public ParserException(String err){
        errStr=err;
   }
}

class ParserWithVar{
    //符号类型
    final int NONE = 0;
    final int DELIMITER = 1;
    final int VARIABLE = 2;
    final int NUMBER = 3;

    //出现错误类型
    final int SYNTAX = 0;
    final int UNBALPARENS = 1;
    final int NOEXP = 2;
    final int DIVBYZERO = 3;

    //字符串结束标志
    final String EOF = "\0";

    private String exp;
    private int expIdx;
    private String token;
    private int tokeType;

    //变量数组
    private double vars[] =new double[26];
    //程序进去点
    public double evaluate(String expstr)throws ParserException{
        double result;
        exp = expstr;
        expIdx = 0;

        getToken();
        if(token.equals(EOF))
            handErr(NOEXP);
        result = evalExp1();
        if(!token.equals(EOF))
            handErr(SYNTAX);
        return result;
    }

    private double evalExp1()throws ParserException{
        double result;
        int varIdx;
        int ttokType;
        String temptoken;

        if(tokeType  == VARIABLE){
            //保存旧表达式
            temptoken = new String(token);
            ttokType = tokeType;

            varIdx = Character.toUpperCase(token.charAt(0)) - 'A';

            getToken();

            if(!token.equals("-")){
                putBack();
                //恢复旧的表达式
                token = new String(temptoken);
                tokeType = ttokType;
            }

            else {
                getToken();
                result = evalExp2();
                vars[varIdx] = result;
                return result;
            }
        }
        return evalExp2();
    }
        private double evalExp2()throws ParserException{
            char op;
            double result;
            double patialResult;

            result = evalExp3();
            while((op = token.charAt(0) ) == '-' || op=='+'){
                getToken();
                patialResult = evalExp3();
            switch(op){
                case '-':
                    result -= patialResult;
                    break;
                case '+':
                    result += patialResult;
                    break;
            }
            }
            return result;
        }

        //乘除取余
        private double evalExp3()throws ParserException{
            char op;
            double result;
            double patialResult;

            result = evalExp4();

            if((op =token.charAt(0)) == '*' || op == '/' || op== '%'){
                getToken();
                patialResult = evalExp4();
                switch(op){
                    case '*':
                        result *= patialResult;
                        break;
                    case '/':
                        if(patialResult == 0.0)
                            handErr(DIVBYZERO);
                        else{
                        result /= patialResult;
                        break;
                        }
                    case '%':
                        if(patialResult == 0.0)
                            handErr(DIVBYZERO);
                        else{
                        result %= patialResult;
                        break;
                        }
                    }
            }
            return result ;
        }
        
        private double evalExp4()throws ParserException{
            double result;
            double patialResult;
            double ex;
            int t;

            result = evalExp5();

            if(token.equals("^")){
                getToken();
                patialResult = evalExp4();
                ex = result;
                if(patialResult == 0.0)
                    result = 1.0;
                else
                    for(t = (int)patialResult -1;t > 0;t--)
                        result = result * ex;
            }
            return result;
        }

        //正负号
        private double evalExp5()throws ParserException{
            double result;
            String op;

            op="";
            if((tokeType == DELIMITER && token.equals("+") || token.equals("-"))){
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
                       handErr(UNBALPARENS);
                   getToken();
            }
            else result = atom();

            return result;
        }

        private double atom() throws ParserException{

            double result = 0.0;

            switch(tokeType){
                case NUMBER:
                    try{
                        result = Double.parseDouble(token);
                    }catch(NumberFormatException exc){
                        handErr(SYNTAX);
                    }
                    getToken();
                    break;
                case VARIABLE:
                    result =findVar(token);
                    getToken();
                    break;
                default:
                    handErr(SYNTAX);
                    break;
            }

            return result;
        }

        //查找变量值
        private double findVar(String vname) throws ParserException{
            if(!Character.isLetter(vname.charAt(0))){
                handErr(SYNTAX);
                return 0.0;
            }

            return vars[Character.toUpperCase(vname.charAt(0))-'A'];
        }

        private void putBack(){
            if(token == EOF) return;
            for(int i = 0;i<token.length();i++) expIdx++;
        }

        private void handErr(int error)throws ParserException{
            String[] err={
                "语法错误",
                "括号不匹配",
                "没有表达式",
                "被除数为0"
            };

            throw new ParserException(err[error]);
        }

        //转到下一个标识
        private void getToken(){
            tokeType = NONE;
            token="";

            if(expIdx == exp.length()){
                token = EOF;
                return;
            }
            //跳过空格
            while(expIdx < exp.length() && Character.isWhitespace(exp.charAt(expIdx))) expIdx++;

            if(expIdx == exp.length()){
                token = EOF;
                return;
            }

            if(isDelim(exp.charAt(expIdx))){
                token += exp.charAt(expIdx);
                expIdx++;
                tokeType = DELIMITER;
            }

            else if(Character.isLetter(exp.charAt(expIdx))){
                while(!isDelim(exp.charAt(expIdx))){
                    token += exp.charAt(expIdx);
                    expIdx++;
                    if(expIdx >= exp.length()) break;
                }
                tokeType = VARIABLE;
            }
            else if(Character.isDigit(exp.charAt(expIdx))){
                while(!isDelim(exp.charAt(expIdx))){
                    token += exp.charAt(expIdx);
                    expIdx++;
                    if(expIdx >= exp.length())  break;
                }

                tokeType = NUMBER;
            }

            else{
                token = EOF;
                return ;
            }
        }

        private boolean isDelim(char c){
            if("-+^%*=()".indexOf(c) != -1)
                return true;
            return false;
        }
}
