import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class FourLabel extends JFrame{
    public FourLabel(){
        setLayout(new GridLayout(4,1,0,0));
        LineBorder lineBorder = new LineBorder(Color.RED,4);

        JLabel lable1 = new JLabel("label1");
        JLabel lable2 = new JLabel("label2");
        JLabel lable3 = new JLabel("label3");
        JLabel lable4 = new JLabel("label4");

        lable1.setBorder(lineBorder);
        lable2.setBorder(lineBorder);
        lable3.setBorder(lineBorder);
        lable4.setBorder(lineBorder);

        add(lable1);
        add(lable2);
        add(lable3);
        add(lable4);

    }

    public static void main(String[] args){
        FourLabel frame = new FourLabel();

        frame.setTitle("Four Label");
        frame.setSize(100,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


