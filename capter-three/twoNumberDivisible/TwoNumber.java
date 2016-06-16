import java.util.Scanner;

public class TwoNumber{
	public static void main(String[] args){
		Scanner input =  new Scanner(System.in);

		System.out.println("请输入一个数，接下来我会对它进行判断");
		int number =  input.nextInt();

		boolean fiveAble = (boolean)(number%5==0);
		boolean sixAbel = (boolean)(number%6==0);

		if(fiveAble&&sixAbel)
			System.out.println("这个数能同时被５和６整除");
		else if(fiveAble||sixAbel)
			System.out.println("这个数能被５和６中的一个整除");
		else 
			System.out.println("这个数不能被５和６中的任何一个整除");
	}
}
