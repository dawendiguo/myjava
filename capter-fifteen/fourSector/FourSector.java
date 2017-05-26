import javax.swing.*;
import java.awt.*;

public class FourSector extends JFrame{
	FourSector(){
		setLayout(new GridLayout(2,2));
		for(int i = 0 ;i < 4;i++)
			add(new Sector());
	}

	public static void main(String[] args){
		FourSector frame = new FourSector();

		frame.setTitle("Foue sector !");
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
class Sector extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);

		int width = (int)(getWidth());
		int height = (int)(getHeight());
		int radius = (int)(Math.min(width,height)*0.4);
		int x = width/2 - radius;
		int y = height/2 - radius;
		g.fillArc(x,y,2*radius,2*radius,0,30);
		g.fillArc(x,y,2*radius,2*radius,90,30);
		g.fillArc(x,y,2*radius,2*radius,180,30);
		g.fillArc(x,y,2*radius,2*radius,270,30);
		g.drawOval(x,y,2*radius,2*radius);
	}
}
