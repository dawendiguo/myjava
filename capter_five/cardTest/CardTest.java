import java.util.Scanner;

public class CardTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Card Number : ");
        String cardNumberString = input.next();
        long cardNumber = Long.valueOf(cardNumberString);
        System.out.println("the number is "+cardNumber);
        if(testCard(cardNumber))
            System.out.println("You card "+cardNumber+" is ilegal");
        else
            System.out.println("You card "+cardNumber+"is unilegal!");
    }
    public static boolean testCard(long number){
        int sum = 0;
        boolean re = true;
        for(long i=number/10;i>0;i/=100){
            int doubleDigits =(int)(i%10);
            if(doubleDigits>=5)
                sum = sum + 1 +(doubleDigits*2%10);
            else
                sum+=doubleDigits*2;
        }
        for(long  i = number ;i>0;i/=100){
            sum += i%10;
        }
        System.out.println("The sum is "+sum);

        if(sum % 10==0)
            re = true ;
        else
            re = false;
        return re;
    }
    /*public static int digits(long number){
        int i =0;
        while((int)(number / Math.pow(10,i))>0){
            i++;
        }
        return i ;
    }
    public static int numberDigits(long number ,int n){
        int digitNumber =(int)(number/Math.pow(10,n))%10;
        int doubleDigitNumber = digitNumber * 2;
        int re = doubleDigitNumber;
        if(doubleDigitNumber>=10)
            re = doubleDigitNumber/10 + doubleDigitNumber%10;
        return re;
    }*/
}
