import javax.swing.JOptionPane;

public class Monthpay{
public static void main(String[] args){
String namestring = JOptionPane.showInputDialog(null,"Enter employee's name:");
String hoursstring = JOptionPane.showInputDialog(null,"Enter number of hours worked in a week :");
String hourpaystring = JOptionPane.showInputDialog(null,"Enter hourly pay rate:");
String fedralratestring = JOptionPane.showInputDialog(null,"Enter federal tax withholding rate:");
String stateratestring = JOptionPane.showInputDialog(null,"Enter state tax withholding rate:");
double hours = Double.parseDouble(hoursstring);
double hourpay = Double.parseDouble(hourpaystring);
double fedralrate = Double.parseDouble(fedralratestring);
double staterate = Double.parseDouble(stateratestring);
double fedralpay = hours * hourpay * fedralrate ;
double statepay = hours * hourpay * staterate ;
String output ="Employee Name: " + namestring + "\nHours weekly: " + hours + "\nPay Rate: $" + hourpay + "\n Cross Pay:  $" + (hours * hourpay) + "\nDeductions: \n" + "	Federal withholding (" + fedralrate*100 +"):"  + fedralpay + "\n	State Withholding (" + staterate*100 +"):" +statepay + "\n 	Total Deduction: " + (fedralpay + statepay) +"\n Net pay :	"+ (hours * hourpay - fedralpay - statepay);
JOptionPane.showMessageDialog(null,output);
}
}
