import javax.swing.*;

public class MessageDisplay extends JApplet{
	public void main(){
		String message = getParameter("MESSAGE");
		int x = Integer.parseInt(getParameter("X"));
		int y = Integer.parseInt(getParameter("Y"));

		MessagePanel messagePanel = new MessagePanel();
		messagePanel.setXCoordinate(x);
		messagePanel.setYCoordinate(y);

		add(messagePanel);
	}
}
