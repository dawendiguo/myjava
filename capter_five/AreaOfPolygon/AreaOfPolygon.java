import java.util.Scanner;

public class AreaOfPolygon{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Line of Polygon:");
        double line = input.nextDouble();
        System.out.print("Enter the polygon line number:");
        int LineNumber = input.nextInt();

        double area = (LineNumber * line * line)/(4*Math.tan(Math.PI/LineNumber));

        System.out.printf("The Area is : %.2f\n",area);

    }
}

