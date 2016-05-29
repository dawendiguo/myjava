import javax.swing.JOptionPane;

public class RandomNumber{
public static void main(String[] args){
int num1 = (int)(System.currentTimeMillis()%10);
int num2 = (int)(System.currentTimeMillis()*7%10);

String output =  "what is " + num1 + "+" + num2 + " ? ";

String numstring = JOptionPane.showInputDialog(null,output);

int num = Integer.parseInt(numstring);

if( (num1 + num2) == num)
	JOptionPane.showMessageDialog(null,"Congratulations,you get the right anser");
else 
	JOptionPane.showMessageDialog(null,"sorry ,but you are wrong");
}
}
