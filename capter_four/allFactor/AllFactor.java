import java.util.Scanner;

public class AllFactor{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number==1||number == 2){
            System.out.println("The "+number+"Only factor is "+number);
        }
        System.out.print("The "+number+" all factor is ");
        for(int i = 2;number != 1&&i<=number;i++){
            while(number % i==0){
                System.out.print(i+",");
                number = number/i;
            }
        }
        System.out.println();
    }
}
