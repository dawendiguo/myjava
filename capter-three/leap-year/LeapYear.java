import javax.swing.JOptionPane;

public class LeapYear{
public static void main(String[] args){
String yearstring = JOptionPane.showInputDialog(null,"The year");
int year = Integer.parseInt(yearstring);
String output= " ";
if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0))
output = "The " + year + " is a leap year.";
else 
output = "The " + year +" is not a leap year. ";
JOptionPane.showMessageDialog(null,output);
}
} 
