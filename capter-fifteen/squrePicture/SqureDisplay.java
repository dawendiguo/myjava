import javax.swing.*;
import java.awt.*;

public class SqureDisplay extends JFrame{
	SqureDisplay(){
		add(new SqurePanel());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Squre!");
		setSize(200,200);
	}

	public static void main(String[] args){
		SqureDisplay frame = new SqureDisplay();

		frame.setVisible(true);
	}
}
