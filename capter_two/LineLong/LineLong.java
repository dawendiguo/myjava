import java.util.Scanner;

public class LineLong{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

double x1 = input.nextFloat();
double y1 = input.nextFloat();
double x2 = input.nextFloat();
double y2 = input.nextFloat();

double linelong = Math.pow((Math.pow((x2-x1),2))+(Math.pow((y2 - y1),2)),0.5);

System.out.println("The distance of the two points is " + linelong);
}
}
