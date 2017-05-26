import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel{
	int type = 0;

	GamePanel(int type){
		this.type = type;
	}

	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		int width = (int)(getWidth());
		int height = (int)(getHeight());

		if(type == 0)
			g.drawOval((int)(0.1*width),(int)(0.1*height),(int)(0.8*width),(int)(0.8*height));
		else if(type == 1){
			g.drawLine((int)(0.1*width),(int)(0.1*height),(int)(0.9*width),(int)(0.9*height));
			g.drawLine((int)(0.9*width),(int)(0.1*height),(int)(0.1*width),(int)(0.9*height));
		}
		else
			g.drawString(" ",(int)(width/2),(int)(height/2));
	}

	public int getType(){
		return type;
	}
	public void setType(int type){
		this.type = type;
	}
}
