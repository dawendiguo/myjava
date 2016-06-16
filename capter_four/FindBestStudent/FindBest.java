import java.util.Scanner;
public class FindBest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the count of student:");
        int count = input.nextInt();
        System.out.println("the nextint is "+count);
        int maxcount = 0;
       double max=0;
        Student[] stu = new Student[count];
        for(int i=0;i<count;i++){
            System.out.print("Enter the "+i+" student name and score");
            String tempname = input.nextLine();
            double tempscore = input.nextDouble();
            stu[i]=new Student(tempname,tempscore);
        }
        for(int i = 0;i<count;i++){
            if(max<stu[i].score){
                max = stu[i].score;
                maxcount = i;
            }
        }
        System.out.print("The best student is "+stu[maxcount].name+" and his score is "+stu[maxcount].score);
    }
}

