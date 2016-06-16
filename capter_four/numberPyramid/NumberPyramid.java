import java.util.Scanner;

public class NumberPyramid{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Plese input a number :");
        int number = input.nextInt();

        for(int i = 1;i<=number;i++){
            for(int j = 1;j< 2 * number;j++){
                if((j+i)>number&&(j-i)<number){
                    int pr = (j<=number)?(number-j+1):(j-number+1);
                    System.out.printf("%6d",pr);
                }
                else
                    System.out.print("      ");

            }
            System.out.println();
        }
    }
}
