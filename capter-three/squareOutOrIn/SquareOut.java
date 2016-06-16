import java.util.Scanner;

public class SquareOut{
    public static void main(String[] args){
        double initx = 5,inity = 2.5;
        Scanner input = new Scanner(System.in);
        System.out.printf("Please input a point (eg:1.0 2.4):");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if( Math.abs(x) <= Math.abs(initx)  && Math.abs(y) <= Math.abs(inity))
            System.out.println("The point:("+x+","+y+")is in the square long 10 high 5 for origin (0,0)");
        else
            System.out.println("The point:("+x+","+y+")is out of the square long 10 high 5 for oringin (0,0)");
    }
}

