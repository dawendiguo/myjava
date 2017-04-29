import javax.swing.*;
import java.awt.*;

public class MultiPanel extends JPanel{
public MultiPanel(){
	this.setLayout(new GridLayout(10,10));
	for(int i = 0 ;i < 10;i++)
		for(int j = 0 ;j < 10;j++)
			if(i==0&&j==0)
				add(new JLabel(" "));
			else if(i == 0)
				add(new JLabel(Integer.toString(j),SwingConstants.CENTER));
			else if (j ==0)
				add(new JLabel(Integer.toString(i),SwingConstants.CENTER));
			else{
				add(new JLabel(Integer.toString(i*j),SwingConstants.CENTER));
			}
	}

	protected void paintComponent(Graphics g){
		super.paintComponent(g);

		g.drawLine((int)(getWidth()*0.1),(int)(getHeight()*0.1),(int)(getWidth()),(int)(getHeight()*0.1));
		g.drawLine((int)(getWidth()*0.1),(int)(getHeight()*0.1),(int)(getWidth()*0.1),(int)(getHeight()));
	}
}

