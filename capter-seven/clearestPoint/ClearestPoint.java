import java.util.Scanner;

public class ClearestPoint{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of point; ");
        int numberOfPoint = input.nextInt();

        double[][] points = new double[numberOfPoint][2];
        System.out.println("Enter "+numberOfPoint+" points:");
        for(int i = 0;i<numberOfPoint;i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        int p1 = 0,p2 = 1;
        double shortestDistance = distance(points[p1][0],points[p1][1],points[p2][0],points[p2][1]);

        for(int i = 0;i < points.length;i++)
            for(int j = i+1;j < points.length;j++){
                double distance = distance (points[i][0],points[i][1],points[j][0],points[j][1]);

                if(shortestDistance > distance){
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        System.out.println("The short closest two points are "+"("+points[p1][0]+","+points[p1][1]+") and ("+points[p2][0]+","+points[p2][1]+")");
    }

    static double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
}