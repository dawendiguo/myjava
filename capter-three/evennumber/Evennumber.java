import javax.swing.JOptionPane;

public class Evennumber{
	public static void main(String[] args){
		String numberString = JOptionPane.showInputDialog(null,"请输入一个数字");
		int number = Integer.parseInt(numberString);

		if(number%2==0)
			JOptionPane.showMessageDialog(null,number+"是个偶数");
		else 
			JOptionPane.showInputDialog(number+"不是一个偶数");
	}
}

