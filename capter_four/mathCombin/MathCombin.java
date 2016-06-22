import java.util.Scanner;

public class MathCombin{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("please input a number :");
        int number = input.nextInt();
        int count = 0;

        for(int i = 1;i<= number ;i++){
            for(int j = i+1;j<=number;j++){
                System.out.println(i+"      "+j);
                count++;
                }
        }
        System.out.println("The number pick two number total hava "+(count-1)+" combinations");
    }
}



