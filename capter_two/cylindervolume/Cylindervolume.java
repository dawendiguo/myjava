import javax.swing.JOptionPane;

public class Cylindervolume{
public static void main(String[] args)
{
	String radiusstring = JOptionPane.showInputDialog(null,"Enter the cylinde radius as doubletype ");
	String highstring = JOptionPane.showInputDialog(null,"Enter the high as doubletype");
	double radius = Double.parseDouble(radiusstring);
	double high = Double.parseDouble(highstring);
	double area = radius*radius*3.1415926;
	double volume = area*high;
	String ouput = "The Cylinder volume is " + volume + "The Cylinder area is " + area;

	JOptionPane.showMessageDialog(null,ouput);
}
}
