import javax.swing.JOptionPane;

public class Integeradd{
public static void main(String[] args){
String integerstring = JOptionPane.showInputDialog(null,"Enter a number as integer");
int integer = Integer.parseInt(integerstring);
int add = 0;
for(int i = 10;integer*10/i != 0;i*=10){
	add = (integer%i*10/i) + add;
}

String output = " The adder is " + add;
JOptionPane.showMessageDialog(null,output);
}
}
