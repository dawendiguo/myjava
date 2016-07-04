import java.util.Scanner;

public class GetPentagonalNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("please input a integer number: ");
        int number = input.nextInt();

        for(int i = 1;i<=number;i++){
            if(i%10==0)
                System.out.printf("%10d\n",getPentagonalNumber(i));
            else
                System.out.printf("%10d",getPentagonalNumber(i));
        }
    }
    public static int getPentagonalNumber(int num){
        return num*(num*3-1)/2;
    }
}
