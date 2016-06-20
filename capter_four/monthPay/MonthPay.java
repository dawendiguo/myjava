import java.util.Scanner;

public class MonthPay{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount :");
        double acount = input.nextDouble();
        double monthPay = 0;
        double monthRate = 0;
        System.out.print("Number of Years :");
        int year = input.nextInt();
        System.out.println("Interest Rate           Monthly Payment         Total  Payment");
        for(double rate = 5.0;rate <= 8.0;rate+=0.125){
           for(int i = 0;i < year;i++){
               monthRate = rate/12/100;
               monthPay = (acount * monthRate * Math.pow((1 + monthRate),12*year))/(Math.pow((1+monthRate),12*year)-1);
           }
           System.out.printf("%.3f%%           %.2f        %.2f\n",rate,monthPay,monthPay*12*year);
        }
    }
}
