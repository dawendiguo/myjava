import java.util.Scanner;

public class RandomAdd{
	public static void main(String[] args){
		int a = (int)(Math.random()*100);
		int b = (int)(Math.random()*100);

		System.out.printf("随机的这两个数分别是"+a+"和"+b+"它们的和是"+(a+b)+'\n');
	}
}
