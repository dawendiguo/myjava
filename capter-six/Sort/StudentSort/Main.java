import java.util.Scanner;
public class Main{
             String name;
             double score;
    public Main(){}
    public Main(String name,double score){this.name = name;this.score = score;}
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Student:");
        int numberStudent = input.nextInt();
        Main[] stu = new Main[numberStudent];
        for(int i = 0;i < numberStudent;i++){
            System.out.print("Enter the Student name and Score: ");
            stu[i] = new Main(input.next(),input.nextDouble());
        }
        sort(stu);
        System.out.println("The score big to small 's name is :");
        for(int i = 0;i<numberStudent;i++){
            System.out.println(stu[i].name);
        }
    }
    public static void sort(Main[] stu){
        int loop = stu.length;
        while(loop > 1){
            for(int i = 0 ;i< loop-1;i++){
                if(stu[i].score<stu[i+1].score){
                    String tempString = stu[i].name;
                    double tempScore = stu[i].score;
                    stu[i].name = stu[i+1].name;
                    stu[i].score = stu[i+1].score;
                    stu[i+1].name = tempString;
                    stu[i+1].score = tempScore;
                }
            }
            loop--;
        }
    }
}
