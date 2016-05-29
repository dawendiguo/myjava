import java.util.Scanner;

public class Average{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

double a1 = input.nextDouble();
double a2 = input.nextDouble();
double a3 = input.nextDouble();

double aver=(a1 + a2 + a3)/3;

System.out.println("The three number:"+ a1 + " "+ a2 + " " + a3+ " average is:"+ aver);
}
}
