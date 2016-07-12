import java.util.Scanner;

public class RollSieve{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i =1 ;
        while(i>0){
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
            i = input.nextInt();
        }
    }
    public static void testNumber(int number  ) {

        System.out.println("point is " +number);
            do{int n1  = (int)(Math.random()*6) + 1;
            int n2  = (int)(Math.random()*6) + 1;
            System.out.println("You rolled " + n1 + " + " + n2 + " = " + (n1+n2));
            int sum = n1+n2;
            if(sum == number){
                System.out.println("You win!");
                break;
            }
            else  if(sum == 7)
            {
                System.out.println("You lose");
                break;
            }
            else
                System.out.println("point is "+ sum);
            }while(1>0);
    }
}

