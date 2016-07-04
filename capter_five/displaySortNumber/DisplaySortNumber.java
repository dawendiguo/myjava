import java.util.Scanner;

public class DisplaySortNumber{
        final static int SIZE = 10;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter "+SIZE+" integer number: ");
        int[] num = new int[SIZE];
        for(int i =0;i<SIZE;i++){
            num[i]=input.nextInt();
        }
        sort(num);
        for(int i = 0;i<SIZE;i++){
            int count = 0;
            while(count<=i){
                System.out.printf("%4d",num[count]);
                count++;
            }
            System.out.println();
        }
    }
    public static void sort(int[] num){
        int[] temp  = new int[SIZE];
        for(int i = 0;i<SIZE;i++){
            temp[i] = num[i];
        }
        for(int i = 0;i<SIZE;i++){
            for(int j = i+1;j<SIZE;j++){
                if(temp[j]>temp[i]){
                    int k = temp[j];
                    temp[j] = temp[i];
                    temp[i] = k;
                }
            }
        }
        for(int i = 0;i<SIZE;i++){
            num[i]=temp[i];
        }
    }
}
