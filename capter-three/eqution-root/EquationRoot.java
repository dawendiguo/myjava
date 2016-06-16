import java.util.Scanner;

public class EquationRoot{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入二元一次方程的各参数，A,B,C,D,E,F");

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		double	test = a * d - b * c;
		if(test == 0)
		System.out.println("The equation has no solution");
		else 
		System.out.printf("x is " + (e * d - b * f)/test +"and y is "+ (a * f - e * c )/test+'\n');
	}
}
