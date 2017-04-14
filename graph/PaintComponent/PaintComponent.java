import javax.swing.*;
import java.awt.Graphics;

public class PaintComponent extends JFrame{
    public PaintComponent(){
        add(new NewPanel());
    }

    public static void main(String[] args){
        PaintComponent frame = new PaintComponent();

        frame.setTitle("Test Paint component ");
        frame.setSize(200,100);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class NewPanel extends JPanel{
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawLine(0,0,50,50);
        g.drawString("Banner",0,40);
    }
}
