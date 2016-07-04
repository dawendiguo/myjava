import java.util.Scanner;

public class SumDigtal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        int number =  input.nextInt();

        System.out.println("The "+number+" every digtal sum is "+getDigits(number));
    }
    public static int getDigits(int num){
        int digit = 0;
        while (num!=0){
            digit += (num%10);
            num /=10;
        }
        return digit;
    }
}
