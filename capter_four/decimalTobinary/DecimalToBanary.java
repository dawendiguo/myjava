import java.util.Scanner;

public class DecimalToBanary{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("plese int a oxiend number :");
        int number = input.nextInt();
        int[] banaryNumber = new int[1000];

        int numberCopy = number;
        int i = 0;
        while(numberCopy != 0){
            banaryNumber[i] = (int)numberCopy%2;
            numberCopy = numberCopy/2;
            i++;
        }
        System.out.print("The "+number+" to Banary is:");
        for(int k = i-1 ;k >= 0 ;k--)
            System.out.print(banaryNumber[k]);
        System.out.println();
    }
}

