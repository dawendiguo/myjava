import javax.swing.*;
import java.awt.*;

public class MyFlow extends JFrame{
    public MyFlow(){
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.LEFT));

        p1.add(new JButton("Button1"));
        p1.add(new JButton("Button2"));
        p1.add(new JButton("Button3"));

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.LEFT));
        p2.add(new JButton("Button4"));
        p2.add(new JButton("Button5"));
        p2.add(new JButton("Button6"));

        setLayout(new FlowLayout(FlowLayout.LEFT,0,10));
        add(p1);
        add(p2);
    }

    public static void main(String[] args){
        MyFlow frame = new MyFlow();

        frame.setTitle("Exerclse12_1");
        frame.setSize(600,15);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
