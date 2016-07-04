import java.util.Scanner;

public class AlmostSqrt{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a double number: ");
        double number = input.nextDouble();
        System.out.println(number+ " almost sqrt is : "+ almostSqrt(number));
    }
    public static double almostSqrt(double number){
        double lastGuess = 1.0;
        double nextGuess = (lastGuess + (number/lastGuess))/2;
        while(Math.abs(nextGuess - lastGuess)>= 0.00001){
            lastGuess = nextGuess;
            nextGuess = (lastGuess + ( number/lastGuess))/2;
        }
        return nextGuess;
    }
}
