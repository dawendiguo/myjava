import javax.swing.*;
import java.awt.*;

public class NumberDisplay extends JFrame{
	public NumberDisplay(){
		setLayout(new GridLayout(11,11));
		for(int i = 1;i < 12;i++)
			for(int j = 1;j < 12;j++){
				if(j<=i)
					add(new CenterMessage(j));
				else
					add(new CenterMessage());
	}
	}
	public static void main(String[] args){
		NumberDisplay frame = new NumberDisplay();

		frame.setTitle("Number Display test!");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
class  CenterMessage extends JPanel{
	int i = 0;
	String s = " ";
	CenterMessage(int i){
		this.i = i;
	}
	CenterMessage(){
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);

		FontMetrics fm = g.getFontMetrics();
		
		int stringWidth = fm.stringWidth(Integer.toString(i));
		int stringAscent = fm.getAscent();

		int xCoordinate = getWidth()/2-stringWidth/2;
		int yCoordinate = getHeight()/2+stringAscent/2;

		if(i!=0)
			g.drawString(Integer.toString(i),xCoordinate,yCoordinate);
		else 
			g.drawString(" ",xCoordinate,yCoordinate);

	}
}


