import java.util.Scanner;
public class StudentScore{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of student:");
        int stuNum = input.nextInt();
        System.out.println("Enter "+ stuNum + " scores: ");
        double[] scores = new double[stuNum];
        for(int i = 0;i<scores.length;i++)
            scores[i]=input.nextDouble();
        for(int i = 0 ;i < scores.length;i++)
            System.out.println("student " + i + " score is "+scores[i]+ "and grade is "+ grade(scores,scores[i]));
    }
    public static char grade(double[] scores,double iscoce){
        double max = scores[0];
        for(int i = 0 ;i < scores.length;i++)
            if(scores[i]>max)
                max = scores[i];
        char re = 'A';
        if(iscoce >= (max-10))
            re = 'A';
        else if ( iscoce >= (max - 20))
            re = 'B';
        else if (iscoce >= (max - 30))
            re = 'C';
        else if ( iscoce >= (max - 40))
            re = 'D';
        else
            re = 'F';
        return re;
    }
}
