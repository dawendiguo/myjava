import java.util.Scanner;

public class PrimeCount{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a integer number : ");
        int number = input.nextInt();

        System.out.println("less than "+number+" all hava " + primeCount(number)+ " prime.");
    }

    public static int primeCount(int number){
        int count  = 1;
        for(int i = 3;i<= number;i++){
            if(isPrime(i))
                count++;
            }
        return count;
    }
    public static boolean isPrime(int number){
        boolean isprime = true;
        for(int i = 2 ;i < (number/2+1);i++)
            if(number%i==0)
                isprime = false;
        return isprime;
    }
}
