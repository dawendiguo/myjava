import javax.swing.*;
import java.awt.*;

public class TestMulti extends JFrame{
	TestMulti(){
		setLayout(new GridLayout(2,1));
		JLabel jbt= new JLabel("Multiplication Table",SwingConstants.RIGHT);
		jbt.setSize(50,500);
		MultiPanel panel = new MultiPanel();
		panel.setSize(500,500);
		add(jbt);
		add(panel);
		this.setSize(550,500);
	}

	public static void main(String[] args){
		TestMulti frame = new TestMulti();
		
		frame.setTitle("乘法口决");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
