import java.util.Scanner;

public class TeacherHelp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[][] studentAnswer = new int[3][4];
        System.out.println("Enter "+studentAnswer.length + " rows and "+studentAnswer[0].length + " cloumns:");
        for(int i = 0;i  < studentAnswer.length;i++)
            for(int j = 0;j < studentAnswer[0].length;j++)
                studentAnswer[i][j] = input.nextInt();
        System.out.println("\nSum of all elements is "+sum(studentAnswer));
    }

    static int sum(int[][] m){
        int total = 0;
        for(int i = 0;i < m.length;i++)
            for(int j = 0;j < m[0].length;j++)
                total += m[i][j];
        return total;
    }
}

