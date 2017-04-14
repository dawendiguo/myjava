import javax.swing.*;
import java.awt.*;

public class DrawPolygon extends JFrame{
    public DrawPolygon(){
        setTitle("DrawPolygen");
        add(new PolygonsPanel());
    }

    public static void main (String[] args){
        DrawPolygon frame = new DrawPolygon();

        frame.setSize(200,250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

class PolygonsPanel extends JPanel{
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        int xCenter = getWidth()/2;
        int yCenter = getHeight()/2;
        int radius = (int)(Math.min(getWidth(),getHeight()) * 0.4);

        Polygon polygon = new Polygon();

        polygon.addPoint(xCenter + radius, yCenter);
        polygon.addPoint((int)(xCenter+radius*Math.cos(2*Math.PI/6)),(int)(yCenter - radius * Math.sin(2*Math.PI/6)));
        polygon.addPoint((int)(xCenter+radius*Math.cos(2*1*Math.PI/6)),(int)(yCenter - radius * Math.sin(2*Math.PI/6)));
        polygon.addPoint((int)(xCenter+radius*Math.cos(2*2*Math.PI/6)),(int)(yCenter - radius * Math.sin(2*2*Math.PI/6)));
        polygon.addPoint((int)(xCenter+radius*Math.cos(2*3*Math.PI/6)),(int)(yCenter - radius * Math.sin(2*3*Math.PI/6)));
        polygon.addPoint((int)(xCenter+radius*Math.cos(2*4*Math.PI/6)),(int)(yCenter - radius * Math.sin(2*4*Math.PI/6)));
        polygon.addPoint((int)(xCenter+radius*Math.cos(2*5*Math.PI/6)),(int)(yCenter - radius * Math.sin(2*5*Math.PI/6)));

        g.drawPolygon(polygon);
    }
}

