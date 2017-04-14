import javax.swing.*;
import java.awt.*;

public class CenterMessage extends JFrame{
    public CenterMessage(){
        CenterMessagePannel centerPannel = new CenterMessagePannel();
        add(centerPannel);
        centerPannel.setBackground(Color.WHITE);
        centerPannel.setFont(new Font("Californian FB",Font.BOLD,30));
    }

    public static void main(String[] args){
        CenterMessage frame = new CenterMessage();

        frame.setTitle("Test Center Message!");
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class CenterMessagePannel extends JPanel{
    protected void paintComponent(Graphics g){
        super.paintComponent(g);


        FontMetrics fm = g.getFontMetrics();
        int stringWidth = fm.stringWidth("Welcome to Java");
        int stringAscent = fm.getAscent();

        int xCoordinate = getWidth()/2 - stringWidth/2;
        int yCoordinate = getHeight()/2 - stringAscent/2;

        g.drawString("Welcome to Java",xCoordinate,yCoordinate);
    }
}
