import java.util.Scanner;

public class Area{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.println("please input the redius.");
double radius = input.nextDouble();

double area = radius * radius * 3.1415926;
System.out.println("The area for the circle of radius " + radius + " is " + area);
}
}
