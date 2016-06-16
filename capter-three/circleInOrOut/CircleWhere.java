import java.util.Scanner;

public class CircleWhere{
	public static boolean testcircle(double x,double y){

		double test = Math.sqrt(x*x+y*y);
		if(test<=10)
			return true;
		else 
			return false;
}
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.printf("plese input a circle!(eg. 1.0 4.3):");
	double x = input.nextDouble();
	double y = input.nextDouble();
	if(testcircle(x,y))
		System.out.println("the point is in the circle of ten!");
	else 
		System.out.println("the point is out of the circle of ten!");
}
}
