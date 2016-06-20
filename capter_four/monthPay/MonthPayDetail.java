import java.util.Scanner;

public class MonthPayDetail{
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double account = input.nextDouble();
        System.out.print("Number of year:");
        int year = input.nextInt();
        System.out.print("Annual Interest Rate: %\b\b");
        double rate = input.nextDouble();
        System.out.println();

        double monthRate = rate / 12 / 100;
        double temp = Math.pow((1 + monthRate),year*12);
        double monthPay = (account * monthRate * temp)/(temp - 1);
        double allPay = monthPay * 12 * year;
        System.out.printf("Monthly Payment: %.2f\n",monthPay);
        System.out.printf("Total Payment: %.2f\n",allPay);
        System.out.printf("\nPayment        Interest        Principal       Balance\n");
        double[] balance = new double[year*12+1];
        balance[0]=account;
        for(int i = 1;i<=12 * year    ;i++){
            double monthInterest = balance[i-1]*monthRate;
            balance[i]=balance[i-1]-monthPay+monthInterest;
            System.out.printf("%d          %.2f            %.2f             %.2f\n",i,monthInterest,monthPay-monthInterest,balance[i]);
        }
    }
}

