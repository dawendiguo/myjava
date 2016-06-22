import java.util.Scanner;

public class Countdown{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter the number of Seconds:");
        int seconds = input.nextInt();
        long timeMill = System.currentTimeMillis();

        while(seconds > 0 ){
            if( timeMill + 1000 == System.currentTimeMillis()){
                if(seconds > 1 )
                    System.out.println(seconds-1+" seconds remaining.");
                else
                    System.out.println("stopped!");
                seconds--;
                timeMill += 1000;
            }
        }

    }
}
