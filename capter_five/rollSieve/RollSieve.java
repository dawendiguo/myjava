import java.util.Scanner;

public class RollSieve{
    public static void main(String[] args){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        char ch = '\n';
        while(ch=='\n'){
            int n1  = (int)(Math.random()*6) + 1;
            int n2  = (int)(Math.random()*6) + 1;
            System.out.println("You rolled " + n1 + " + " + n2 + " = " + (n1+n2));
            int sum = n1+n2;
            if(sum == 2||sum == 3||sum == 12)
                System.out.println("You lose");
            else if(sum == 7||sum == 11)
                System.out.println("You Win!");
            else
                testNumber(sum);
            input.read(ch);
        }
    }
    public static void testNumber(int number  ) {

            do{int n1  = (int)(Math.random()*6) + 1;
            int n2  = (int)(Math.random()*6) + 1;
            System.out.println("You rolled " + n1 + " + " + n2 + " = " + (n1+n2));
            int sum = n1+n2;
            if(sum == number){
                System.out.println("You win!");
                break;
            }
            if(sum == 7)
            {
                System.out.println("You lose");
                break;
            }
            }while(1>0);
    }
}

