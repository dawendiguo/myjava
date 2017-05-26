import javax.swing.*;
import java.awt.*;

public class Octagon extends JFrame{
	Octagon(){
		OctagonPanel panel = new OctagonPanel();
		add(panel);
	}
	public static void main(String[] args){
		Octagon frame = new Octagon();
		
		frame.setTitle("Octagon");
		frame.setSize(200,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class OctagonPanel extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);

		Polygon polygon = new Polygon();
		int xCenter = (int)(getWidth()/2);
		int yCenter = (int)(getHeight()/2);
		int radius = (int)(Math.min(xCenter,yCenter)*0.8);

		polygon.addPoint(xCenter+radius,yCenter);
		polygon.addPoint(xCenter+(int)(radius*Math.cos(2*Math.PI/8)),yCenter+(int)(radius*Math.sin(2*Math.PI/8)));
		polygon.addPoint(xCenter+(int)(radius*Math.cos(2*2*Math.PI/8)),yCenter+(int)(radius*Math.sin(2*2*Math.PI/8)));
		polygon.addPoint(xCenter+(int)(radius*Math.cos(2*3*Math.PI/8)),yCenter+(int)(radius*Math.sin(2*3*Math.PI/8)));
		polygon.addPoint(xCenter+(int)(radius*Math.cos(2*4*Math.PI/8)),yCenter+(int)(radius*Math.sin(2*4*Math.PI/8)));
		polygon.addPoint(xCenter+(int)(radius*Math.cos(2*5*Math.PI/8)),yCenter+(int)(radius*Math.sin(2*5*Math.PI/8)));
		polygon.addPoint(xCenter+(int)(radius*Math.cos(2*6*Math.PI/8)),yCenter+(int)(radius*Math.sin(2*6*Math.PI/8)));
		polygon.addPoint(xCenter+(int)(radius*Math.cos(2*7*Math.PI/8)),yCenter+(int)(radius*Math.sin(2*7*Math.PI/8)));
		
		g.drawPolygon(polygon);
	}
}
