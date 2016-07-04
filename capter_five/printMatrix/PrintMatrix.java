import java.util.Scanner;

public class PrintMatrix{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter integer number: ");
    int number = input.nextInt();
    for(int i = 0;i<number;i++){
        for(int j = 0;j<number;j++)
            System.out.printf("%3d",(int)(Math.random()*2));
        System.out.println();
    }
}
}
