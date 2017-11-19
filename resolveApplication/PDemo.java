import java.io.*;

class PDemo{
public static void main(String[] args)throws IOException{
    String expr ;
    BufferedReader p =new BufferedReader(new InputStreamReader(System.in));
    ParserWithVar pr = new ParserWithVar();
    System.out.println("enter a empty expresion to stop");
    for(;;){
        System.out.println("输入公式");
        expr = p.readLine();
        if(p.equals("")) break;
        try{
            System.out.println("result is:"+pr.evaluate(expr));
            System.out.println();
        }catch(ParserException exc){
            System.out.println(exc);
        }
    }
}
}
