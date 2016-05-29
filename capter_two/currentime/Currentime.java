import java.util.Scanner;
public class Currentime{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
long totalmiliseconds = System.currentTimeMillis();

long totalseconds = totalmiliseconds/1000;
long currentseconds = totalseconds%60;
long totalminuts = totalseconds/60;
long currentminuts = totalminuts%60;
long totalhours = totalminuts/60;
long currenthours = totalhours%24;
System.out.println("Enter the diffrent with is ");
int hourdiff = input.nextInt();
long turehour = currenthours + hourdiff;
System.out.println("Current time is:"+turehour + ":" + currentminuts + ":" + currentseconds + "GMT");
}
}
