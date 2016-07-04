import java.util.Scanner;

public class TriangleArea{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please input triangle three sideSize: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if(isTriangle(a,b,c))
            System.out.println("It is a Triangle and Its area is "+ triangleArea(a,b,c));
        else
            System.out.println("The three number can not make a triangle!");

    }
    public static boolean isTriangle(double a,double c,double b){
        boolean test = true;
        if((a+b)<=c||(a+c)<=b||(b+c)<=a)
            test = false;
        return test;
    }
    public static double triangleArea(double a,double b ,double c){
        double p = (a+b+c)/2;
        double area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
        return area;
    }
}
