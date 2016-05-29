import javax.swing.JOptionPane;

public class IntToChar{
public static void main(String[] args){
String intstring = JOptionPane.showInputDialog(null,"Enter a integer number ");
int i = Integer.parseInt(intstring);
String output = "The integer " + i + " in ASCII is The char \n " + (char)i;
JOptionPane.showMessageDialog(null,output);
}
}
