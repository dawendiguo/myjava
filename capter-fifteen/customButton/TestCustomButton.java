import javax.swing.*;
import java.awt.*;

public class TestCustomButton extends JFrame{
	TestCustomButton(){
	setLayout(new GridLayout(1,2,5,5));
	add(new CustomButton("OK"));
	add(new CustomButton("Cancel"));
	
	}
	public static void main(String[] args){
		TestCustomButton frame = new TestCustomButton();
		frame.setTitle("custome Button!");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
