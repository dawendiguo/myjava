import java.util.Scanner;

public class ThreePoint{

private static  double Line(float x1,float y1,float x2,float y2){
return Math.pow((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)),0.5);
}
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter three points for triangle:");
float x1 = input.nextFloat();
float y1 = input.nextFloat();
float x2 = input.nextFloat();
float y2 = input.nextFloat();
float x3 = input.nextFloat();
float y3 = input.nextFloat();
double s1 = Line(x1,y1,x2,y2);
double s2 = Line(x2,y2,x3,y3);
double s3 = Line(x1,y1,x3,y3);
double s = (s1+s2+s3)/2;
double area = Math.pow((s*(s-s1)*(s-s2)*(s-s3)),0.5);
System.out.println("The area of the triangle is" + area);
}
}
