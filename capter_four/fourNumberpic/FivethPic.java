import java.util.Scanner;

public class FivethPic{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please input a number :");
        int number = input.nextInt();
        for(int i = 1;i <= number;i++){
            for(int j = 1;j <= 2*number ;j++){
                if((j+i)>number&&(j-i)<number){
                    int p = (j <= number)?(-number-1 + j + i):(number - j +i-1);
                    System.out.printf("%4d",(int)(Math.pow(2,p)));
                }
                else
                    System.out.print("    ");
            }
        System.out.println();
        }
    }
}
