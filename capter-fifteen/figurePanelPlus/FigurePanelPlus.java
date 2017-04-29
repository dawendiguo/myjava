import javax.swing.*;
import java.awt.*;

public class FigurePanelPlus extends JPanel{
	public static final int LINE = 1;
	public static final int RECTANGLE = 2;
	public static final int OVAL = 3;
	public static final int ROUND_TECTANGEL =4;
	public static final int HEXAGON = 5;
	public static final int ARC=6;

	private int type = 1;
	private boolean filled = false;

	public FigurePanelPlus(){
	}

	public FigurePanelPlus(int type ) {
		 this.type=type;
	}

	public FigurePanelPlus(int type, boolean filled){
		this.type = type;
		this.filled = filled;
	}

	protected void paintComponent(Graphics g){
		super.paintComponent(g);

		int width = getWidth();
		int height = getHeight();
		int xCenter = width/2;
		int yCenter = height/2;
		int radius = (int)(Math.min(width,height)*0.4);
		switch(type){
			case LINE:
				g.setColor(Color.BLACK);
				g.drawLine(10,10,width-10,height-10);
				g.drawLine(width-10,10,10,height-10);
				break;
			case RECTANGLE:
				g.setColor(Color.BLUE);
				if(filled)
					g.fillRect((int)(0.1*width),(int)(0.1*height),(int)(width*0.8),(int)(height*0.8));
				else
					g.drawRect((int)(0.1*width),(int)(0.1*height),(int)(0.8*width),(int)(0.8*height));
				break;
			case ROUND_TECTANGEL:
				g.setColor(Color.RED);
				if(filled)
					g.fillRoundRect((int)(0.1*width),(int)(0.1*height),(int)(width*0.8),(int)(height*0.8),20,20);
				else
					g.drawRoundRect((int)(0.1*width),(int)(0.1*height),(int)(0.8*width),(int)(0.8*height),20,20);
				break;
			case OVAL:
				g.setColor(Color.BLACK);
				if(filled)
					g.fillOval((int)(0.1*width),(int)(0.1*height),(int)(0.8*width),(int)(0.8*height));
				else
					g.drawOval((int)(0.1*width),(int)(0.1*height),(int)(0.8*width),(int)(0.8*height));
				break;
			case HEXAGON:
					g.setColor(Color.ORANGE);

					Polygon polygon = new Polygon();
					polygon.addPoint(xCenter+radius,yCenter);
					polygon.addPoint((int)(xCenter+radius*Math.cos(2*Math.PI/6)),(int)(yCenter-radius*Math.sin(2*Math.PI/6)));
					polygon.addPoint((int)(xCenter+radius*Math.cos(2*2*Math.PI/6)),(int)(yCenter-radius*Math.sin(2*2*Math.PI/6)));
					polygon.addPoint((int)(xCenter+radius*Math.cos(2*3*Math.PI/6)),(int)(yCenter-radius*Math.sin(2*3*Math.PI/6)));
					polygon.addPoint((int)(xCenter+radius*Math.cos(2*4*Math.PI/6)),(int)(yCenter-radius*Math.sin(2*4*Math.PI/6)));

					polygon.addPoint((int)(xCenter+radius*Math.cos(2*5*Math.PI/6)),(int)(yCenter-radius*Math.sin(2*5*Math.PI/6)));
					if(filled)
						g.fillPolygon(polygon);
					else
						g.drawPolygon(polygon);

				break;
			case ARC:
				g.setColor(Color.RED);
				int x = xCenter - radius;
				int y = yCenter - radius;
				if(filled){
					g.fillArc(x,y,2*radius,2*radius,0,30);
					g.fillArc(x,y,2*radius,2*radius,90,30);
					g.fillArc(x,y,2*radius,2*radius,180,30);
					g.fillArc(x,y,2*radius,2*radius,270,30);
				}
				else{
					g.drawArc(x,y,2*radius,2*radius,0,30);
					g.drawArc(x,y,2*radius,2*radius,90,30);
					g.drawArc(x,y,2*radius,2*radius,180,30);
					g.drawArc(x,y,2*radius,2*radius,270,30);}
				break;
		}
	}

	public void setType(int type){
		this.type = type;
		repaint();
	}

	public int getType(){
		return type;
	}

	public void setFilled(boolean filled){
		this.filled = filled;
		repaint();
	}

	public boolean getFilled(){
		return filled;
	}

	public Dimension getPreferredSize(){
		return new Dimension(80,80);
	}
}
