import java.util.Scanner;

public class DiffSave{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers :");
        int[] numbers = new int[10];
        int count = 0;
        for(int i = 0;i < 10 ;i++){
            int curren = input.nextInt();
            if(isNotArray(curren,numbers,count)){
                    numbers[count]=curren;
                    count++;
            }
        }
        for(int i = 0 ;i < count;i++)
            System.out.printf("%d ",numbers[i]);
        System.out.println();
        }

    public static boolean isNotArray(int c,int[] numbers,int count){
        boolean re = true;
        for(int i = 0 ;i < count ;i++)
            if(numbers[i]==c)
                re = false;
        return re;
    }
}


