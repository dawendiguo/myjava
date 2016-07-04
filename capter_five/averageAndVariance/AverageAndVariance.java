import java.util.Scanner;

public class AverageAndVariance{
    final static int SIZE = 10;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please input "+ SIZE + " doubleeger number: ");
        double[] array = new double[SIZE];
        for(int i = 0 ;i < SIZE;i++)
            array[i] = input.nextDouble();
        System.out.printf("The mean is %.2f\n",average(array));
        System.out.printf("The standard deviation is %.5f\n",variance(array));
    }
    public static double average(double[] array){
        double aver = 0;
        double sum = 0;
        for(int i = 0;i<SIZE;i++)
            sum += array[i];
        aver = sum / SIZE;
        return aver;
    }
    public static double variance(double[] array){
        double aver = average(array);
        double sumVariance = 0;
        for(int i = 0;i<SIZE;i++){
            sumVariance += (array[i]-aver)*(array[i] - aver);
        }
        return Math.sqrt(sumVariance/(SIZE-1));
    }
}
