import java.util.Scanner;

public class AreaOfFiveLine{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Line of it : " );
        double s = input.nextDouble();
        double area = (5*s*s)/(4*Math.tan(Math.PI/5));
        System.out.println("The area is " +area);
    }
}
