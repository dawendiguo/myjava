import java.util.Scanner;

public class PrimeNumberMetod{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number; ");
        int number = input.nextInt();
        System.out.println("The first "+ number +" are \n");
        printPrimeNumber(number);
        System.out.println();
    }
    public static void printPrimeNumber(int number){
        final int NUMBER_OF_PER_LINE = 10;

        int count = 0;
        int pnumber = 2;

        while ( count < number){
            if(isprime(pnumber)){
                count++;
                if(count%NUMBER_OF_PER_LINE == 0)
                    System.out.printf("%-5s\n",pnumber);
                else
                    System.out.printf("%-5d",pnumber);
                }
                pnumber++;
            }
        }

    public  static boolean isprime(int number){
        boolean prime = true;

        for(int i = 2;i <= number/2;i++)
            if(number%i==0)
                prime = false;
        return prime;
    }
}
