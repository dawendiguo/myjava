import javax.swing.*;
import java.awt.*;

public class Cylinder extends JFrame{
	Cylinder(){
		add(new CylinderPanel());
	}

	public static void main(String[] args){
		Cylinder frame = new Cylinder();

		frame.setTitle("A Cylinder");
		frame.setSize(300,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class CylinderPanel extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);

		int width = (int)(getWidth());
		int height = (int)(getHeight());
		int xRadius = (int)(width*0.8);
		int yRadius = (int)(height * 0.2);
		int line = (int)(height*0.6);

		g.drawOval((int)(width/2-xRadius/2),(int)(height/2-line/2),xRadius,yRadius);
		g.drawOval((int)(width/2-xRadius/2),(int)(height/2+line/2-yRadius/2),xRadius,yRadius);
		g.drawLine((int)(width/2-xRadius/2),(int)(height/2-line/2+yRadius/2),(int)(width/2-xRadius/2),(int)(height/2+line/2));
		g.drawLine((int)(width/2+xRadius/2),(int)(height/2-line/2+yRadius/2),(int)(width/2+xRadius/2),(int)(height/2+line/2));
	}
}
