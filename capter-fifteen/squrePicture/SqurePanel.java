import javax.swing.*;
import java.awt.*;

public class SqurePanel extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);

		int width = (int)(getWidth());
		int height = (int)(getHeight());

		g.drawLine((int)(0.1*width),(int)(0.9*height),(int)(0.9*width),(int)(0.9*height));
		g.drawLine((int)(0.5*width),(int)(0.1*height),(int)(0.5*width),height);
		g.drawLine((int)(0.5*width),(int)(0.1*height),(int)(0.45*width),(int)(0.15*height));
		g.drawLine((int)(0.5*width),(int)(0.1*height),(int)(0.55*width),(int)(0.15*height));
		g.drawLine((int)(0.9*width),(int)(0.9*height),(int)(0.85*width),(int)(0.85*height));
		g.drawLine((int)(0.9*width),(int)(0.9*height),(int)(0.85*width),(int)(0.95*height));
		g.drawString("X",(int)(0.93*width),(int)(0.74*height));
		g.drawString("y",(int)(0.6*width),(int)(0.08*height));

		Polygon p = new Polygon();

		double xInit = 0.5*width;
		double yInit = 0.9*height;

		double scaleFactor = 0.1;
		for(int x = -100;x < 100;x++)
			p.addPoint((int)(x+xInit),(int)(yInit-scaleFactor*x*x));
		g.drawPolygon(p);
	}
}
