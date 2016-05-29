import java.util.Scanner;

public class Moneypay{

public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter yearly interest rate,for example 8.25:");
double annualinterestrate = input.nextDouble();
double monthlyinterestrate = annualinterestrate/1200;
System.out.print("Enter number of years as a integer,for example 5: ");
int  years = input.nextInt();
System.out.print("Enter loan amount,for example 120000.95: ");
double loanamount = input.nextDouble();
double monthpayment = loanamount * monthlyinterestrate / (1- 1 / Math.pow(1 + monthlyinterestrate, years * 12));
double totalpay = monthpayment * years * 12;

System.out.println("The monthly payment is " + (int)(monthpayment * 100)/100.0);
System.out.println("The total payment is " + (int)(totalpay * 100)/100.0);
}
}
