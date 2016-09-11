import java.util.Scanner;

public class BeanMachine{
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int ballNumbers = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int slotsNumbers = input.nextInt();
        int[] slotsBallCount = new int[slotsNumbers+1];
        for(int i = 0 ;i < slotsNumbers;i++)
            slotsBallCount[i] = 0;
    int max = run(slotsBallCount,ballNumbers);
        System.out.println();
        show(slotsBallCount,max);
    }

    public static int run(int[] slotsBallCount,int ballNumbers){
        int max = 0;
        while(ballNumbers >0){
            int count = 0;
            for(int i = 0;i < slotsBallCount.length;i++){
            int index = (int)(Math.random()+0.5);
            if(index == 0)
                System.out.print("L");
            else{
                System.out.print("R");
                count++;
            }
            }
            slotsBallCount[count]++;
            System.out.println();
            ballNumbers--;
        }
        for(int i = 0;i < slotsBallCount.length;i++){
            if(max < slotsBallCount[i])
                max = slotsBallCount[i];
        }
        return max;
    }

    public static void show(int[] slotsBallCount,int max){
        do{
            for(int i = 0 ;i < slotsBallCount.length;i++){
                if(slotsBallCount[i] == max ){
                    System.out.print("0");
                    slotsBallCount[i]=slotsBallCount[i]-1;
                }
                else
                    System.out.print(" ");
                }
            System.out.println();
            max--;
        }while(max > 0);
    }
}
