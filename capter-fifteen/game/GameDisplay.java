import javax.swing.*;
import java.awt.*;

public class GameDisplay extends JFrame{
	GameDisplay(){
	int type = 0;
	setLayout(new GridLayout(3,3));

	for(int i = 0 ;i < 3;i++)
		for(int j = 0 ; j  < 3 ;j++){
			type = (int)(Math.random()*3);
			add(new GamePanel(type));
			repaint();
		}
	}
	public static void main(String[] args){
		GameDisplay frame = new GameDisplay();

		frame.setTitle("Just a game!");
		frame.setSize(800,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
		

