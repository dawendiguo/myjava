import java.util.Scanner;

public class MonthPay{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount :");
        double acount = input.nextDouble();
        double count = acount;
        System.out.print("Number of Years :");
        int year = input.nextInt();
        System.out.println("Interest Rate           Monthly Payment         Total  Payment");
        for(double rate = 5.0;rate <= 8.0;rate+=0.125){
           for(int i = 0;i < year;i++){
               count*=(1+rate/100);
           }
           System.out.printf("%f%%            %.2f        %.2f\n",rate,count/(12*year),count);
           count =  acount;
        }
    }
}
