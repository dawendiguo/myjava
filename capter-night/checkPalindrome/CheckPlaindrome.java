import java.util.Scanner;

public class CheckPlaindrome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String:");
        String s = input.nextLine();

        if(isPlindrome(s))
            System.out.println(s+" is a plindrome");
        else
            System.out.println(s+" is not a plindrome");


    }

    public static boolean isPlindrome(String s){
        int low = 0;
        int high = s.length() - 1;

        while(low < high){
            if(s.charAt(low) != s.charAt(high))
                    return false;

            low++;
            high--;
        }

        return true;
    }
}
