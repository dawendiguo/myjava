import javax.swing.*;

public class Display extends JApplet{
	public Display(){
		add(new JLabel("Great!",JLabel.CENTER));
	}

	public static void main(String[] args){
		JFrame frame = new JFrame("Applet is in the frame");

		Display applet = new Display();
		frame.add(applet);

		frame.setSize(250,50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
