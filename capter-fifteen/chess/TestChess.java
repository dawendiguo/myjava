import javax.swing.*;
import java.awt.*;

public class TestChess extends JFrame{
	public TestChess(){
	setLayout(new GridLayout(8,8));

	for(int i = 0;i < 8 ;i++)
		for(int j = 0;j < 8;j++)
			add(new ChessButton(i+j));
	}
	public static void main(String[] args){
		TestChess frame = new TestChess();

		frame.setTitle("chess!");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
