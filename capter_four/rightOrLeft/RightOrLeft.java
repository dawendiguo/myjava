import java.util.Scanner;

public class RightOrLeft{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please input a big number:");
        int NUMBER = input.nextInt();

        double rightSum = 0;
        double leftSum = 0;
        for(int i = 1;i<NUMBER;i+=2){
            rightSum+=4*(Math.pow(-1,i/2)*1.0/i);
        }
        for(int i = NUMBER+1;i>0;i-=2){
            leftSum+=4*(Math.pow(-1,i/2)*1.0/i);
        }
        System.out.println("The rigth Sum is :"+rightSum+"\nThe left Sum is :"+leftSum);
    }
}
