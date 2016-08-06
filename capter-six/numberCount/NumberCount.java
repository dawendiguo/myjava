import java.util.Scanner;

public class NumberCount{
    public static void main(String[] atgs){
        Scanner input = new Scanner(System.in);
        int[] count = new int[100];
        System.out.println("Enter the integers between 1 and 100:");
        int number = input.nextInt();
        while(number>0&&number<=100){
            count[number-1]++;
            number = input.nextInt();
        }
        for(int i = 0;i<count.length;i++){
            if(count[i]!=0)
                System.out.println((i+1)+ " occurs "+ count[i]+"times");
        }
    }
}
