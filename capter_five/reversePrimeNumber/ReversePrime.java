import java.util.Scanner;

public class ReversePrime{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();
        reversePrimePrint(number);
    }

    public static void reversePrimePrint(int number){
        int count = 2;
        System.out.printf("     2");
        for(int i = 2;i<=number;i++){
            if(isPrime(i)&&isReverse(i))
            {
                if(count%4==0){
                System.out.printf("%8d\n",i);
                count++;
                }
                else{
                System.out.printf("%8d",i);
                count++;
                }
            }
    }
    System.out.println();
    }
    public static boolean isPrime(int number ){
    boolean prime = true;
    for(int i = 2;i<=number/2+1;i++)
        if(number%i==0)
            prime = false;
        return prime;
    }
    public static boolean isReverse(int number){
        return number == reverse(number);
    }

    public static int reverse(int number){
       int numberCopy = number;
       int i = 0 ;
       int[] reverseArry = new int[16];
       while(numberCopy!=0){
           reverseArry[i]=numberCopy%10;
           numberCopy/=10;
           i++;
       }
       i--;
       int reverseNumber = 0;
       int k = 0;
       while(i>=0){
           reverseNumber += reverseArry[k]*Math.pow(10,i);
           i--;
           k++;
       }
       return reverseNumber;
    }
}
