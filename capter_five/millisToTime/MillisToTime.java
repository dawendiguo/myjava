import  java.util.Scanner;

public class MillisToTime{
public static void main( String[] args){
    Scanner input = new Scanner( System.in );

    System.out.print("Enter a Millis time : ");
    long millis = input.nextInt();

    System.out.println("The time millis chang to Time is : "+ convert(millis));
}
public static String convert(long millis){
    long totalSeconds = millis / 1000;
    long second = totalSeconds % 60;
    long minute = totalSeconds/60%60;
    long hour = totalSeconds/3600;
    String output  = hour +":" +minute+":"+second;
    return output;
}
}
