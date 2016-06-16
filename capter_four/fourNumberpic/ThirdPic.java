import java.util.Scanner;

public class ThirdPic{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please input a number: ");
        int number = input.nextInt();
        for(int i = 1;i <= number;i++){
            for( int j = 1;j <= number ;j++){
                if(i+j>number)
                    System.out.printf("%3d",(number-j+1));
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
