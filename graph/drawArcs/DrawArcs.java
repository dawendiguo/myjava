import javax.swing.*;
import java.awt.*;

public class DrawArcs extends JFrame{
    public DrawArcs(){
        setTitle("DrawArcs");
        add(new ArcsPanel());
    }

    public static void main(String[] args){
        DrawArcs frame = new DrawArcs();

        frame.setSize(250,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class ArcsPanel extends JPanel{
    protected void  paintComponent(Graphics g){
        super.paintComponent(g);

        int xCentor = getWidth()/2;
        int yCentor = getHeight()/2;
        int radius = (int)(Math.min(getWidth(),getHeight())*0.4);

        int x = xCentor - radius;
        int y = yCentor - radius;

        g.fillArc(x,y,2*radius,2*radius,0,30);
        g.fillArc(x,y,2*radius,2*radius,90,30);
        g.fillArc(x,y,2*radius,2*radius,180,30);
        g.fillArc(x,y,2*radius,2*radius,270,30);
    }
}
