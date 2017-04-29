import javax.swing.*;
import java.awt.*;

public class ChessButton extends JButton{
	boolean fill = false;

	public ChessButton(){
		super();
	}

	public ChessButton(int number){
		if(number%2==0)
			fill = false;
		else 
			fill = true;
	}

	protected void paintComponent(Graphics g){
		super.paintComponent(g);

		if(fill)
			g.fillRect(0,0,getWidth(),getHeight());
		else 
			g.drawRect(0,0,getWidth(),getHeight());
	}
}
