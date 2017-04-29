import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton{
	String s;
 public CustomButton(String s){
		super(s);
		this.s=s;
	}

	protected void paintComponent(Graphics g){
		g.drawOval((int)(getWidth()*0.1),(int)(getHeight()*0.1),(int)(getWidth()*0.8),(int)(getHeight()*0.8));
		FontMetrics fm = g.getFontMetrics();

		int stringWidth = fm.stringWidth(s);
		int stringAscent = fm.getAscent();

		int xCoodinate = getWidth()/2-stringWidth/2;
		int yCoodinate = getHeight()/2 + stringAscent/2;

		g.drawString(s,xCoodinate,yCoodinate);
	}
}
