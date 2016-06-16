import java.util.Scanner;

public class Test{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        //Student p = new Student(input.nextLine(),input.nextDouble());
        Student[] po = new Student[2];
        po[0]=new Student(input.nextLine(),input.nextInt());
        po[1]=new Student(input.nextLine(),input.nextInt());
        System.out.println(po[0].tostring());
        System.out.println(po[1].tostring());
        System.out.println(po[0].name);

    }
}
