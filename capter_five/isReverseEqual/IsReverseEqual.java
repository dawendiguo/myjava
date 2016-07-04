import java.util.Scanner;

public class IsReverseEqual{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number :");
        int number = input.nextInt();
        if(isPalindrome(number))
            System.out.println(number+" is palindrome!");

        else
            System.out.println(number+" is not a palindrome!");

    }

    public static boolean isPalindrome(int num){
        if(num == reverse(num))
                return true;
        else
                return false;
    }

    public static int reverse(int num){
    int[] mun = new int[10];
    int number = num;
    int count = 0;
    while(number != 0 ){
        mun[count]=number%10;
        number/=10;
        count++;
    }
    count--;
    int renumber=0;
    int i=0;
    while(count>=0){
        renumber +=  mun[i]*Math.pow(10,count);
        count--;
        i++;
    }
    return renumber;
    }
}
