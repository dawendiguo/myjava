import javax.swing.JOptionPane;

public class WaterPowerNeed{
public static void main(String[] args){
String matestring = JOptionPane.showInputDialog(null,"Enter the amount of water i kilograms:");
String inittemperstring = JOptionPane.showInputDialog(null,"Enter the initial temperature:");
String finaltemperstring = JOptionPane.showInputDialog(null,"Enter the final temperature:");
double mate = Double.parseDouble(matestring);
double inittemper = Double.parseDouble(inittemperstring);
double finaltemper = Double.parseDouble(finaltemperstring);
double power = mate * ( finaltemper - inittemper) * 4184;

String output = "The energy needed is " + power;

JOptionPane.showMessageDialog(null,output);
}
}
