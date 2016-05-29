import javax.swing.JOptionPane;

public class EquationDivide{
public static void main(String[] args){
String astring = JOptionPane.showInputDialog(null,"Enter the equation constant A");
String bstring = JOptionPane.showInputDialog(null,"Enter the equation constant B");
String cstring = JOptionPane.showInputDialog(null,"Enter the equation constant C");

double a = Double.parseDouble(astring);
double b = Double.parseDouble(bstring);
double c = Double.parseDouble(cstring);

double judge =  b * b - 4 * a * c;
double x1,x2;
String output;
if(judge > 0){
	x1 = ( -b + Math.pow(judge,0.5))/(2 * a);
	x2 = ( -b - Math.pow(judge,0.5))/(2 * a);
	output = "The roots are " + x1 + "and " + x2;
	}
else if(judge == 0 ){
	x1 = x2 = -b / ( 2 * a);
	output = "the root is " + x1 ;
	}
else 
	output = "The equation has no real roots.";
JOptionPane.showMessageDialog(null,output);
}
}
