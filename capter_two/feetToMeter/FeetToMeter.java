import javax.swing.JOptionPane;

public class FeetToMeter{
public static void main(String[] args){
String feetstring = JOptionPane.showInputDialog(null,"Enter the feet as double ");
double feet = Double.parseDouble(feetstring);
double meter = feet / 3.28;
String output = feetstring + "is the same as " + meter + " meters " ;

JOptionPane.showMessageDialog(null,output);
}
}
