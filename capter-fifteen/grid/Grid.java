import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame{
	public Grid(){
		GridPanel panel = new GridPanel();
		add(panel);
	}
	public static void main(String[] args){
		Grid frame = new Grid();

		frame.setTitle("The Grid");
		frame.setSize(400,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class GridPanel extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);

		g.setColor(Color.RED);
		int xCoordinate = (int)(getWidth());
		int yCoordinate = (int)(getHeight());

		g.drawLine(xCoordinate/3,0,xCoordinate/3,yCoordinate);
		g.drawLine(xCoordinate*2/3,0,xCoordinate*2/3,yCoordinate);

		g.setColor(Color.BLUE);
		g.drawLine(0,yCoordinate/3,xCoordinate,yCoordinate/3);
		g.drawLine(0,yCoordinate*2/3,xCoordinate,yCoordinate*2/3);
	}
}
