//import javax.swing.JButton;
//import javax.swing.JTextField;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import java.awt.GridLayout;
//import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.*;
public class TestPanel extends JFrame{
    public TestPanel(){
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,3));

        for(int i = 1;i < 10;i++)
            p1.add(new JButton(" "+ i));
        p1.add(new JButton(""+0));
        p1.add(new JButton("start"));
        p1.add(new JButton("stop"));

        JPanel p2 = new JPanel(new BorderLayout());
        p2.add(new JTextField("Time to be displayed here"),BorderLayout.NORTH);
        p2.add(p1,BorderLayout.CENTER);

        add(p2,BorderLayout.EAST);
        add(new JButton("Food to be placed here"),BorderLayout.CENTER);
    }

    public static void main(String[] args){
        TestPanel frame = new TestPanel();

        frame.setTitle("The Front view of a Microwave oven");
        frame.setSize(400,250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
