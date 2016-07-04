import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        int number = input.nextInt();
        System.out.println("i            m(i)");
        for(int i = 1;i<=number ;i++)
            System.out.printf("%d\t\t%.5f\n",i,SeriesSum.seriesSum(i));
    }
}
