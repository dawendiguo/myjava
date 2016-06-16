import java.util.Scanner;

public class MaxFactor{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two number :");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int i=0;

        if(n1>n2){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        for(i = n1;i>1;i--){
            if(n1%i==0&&n2%i==0)
                break;
        }
        if(i!=1){
            System.out.println("The "+n1+" And "+n2+" max common factor is "+i);
        }
        else
            System.out.println("The "+n1+" And "+n2+" don't hava common factor eccept 1");
    }
}
