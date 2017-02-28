import javax.swing.*;
import java.awt.*;

public class IconTest extends JFrame{
    public  IconTest(){
        ImageIcon music = new ImageIcon("image/music.jpg");

        JButton jbt1 = new JButton(music);
        JButton jbt2 = new JButton(music);


        JPanel p1 = new JPanel();
        p1.add(jbt1);

        JPanel p2 = new JPanel();
        p2.add(jbt2);

        JPanel p3 = new JPanel();
        p3.add(jbt1);

        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.SOUTH);
        add(p3,BorderLayout.CENTER);
    }

    public static void main(String[] args){
        IconTest  frame =  new IconTest();
        frame.setTitle("ButtonIcons");
        frame.setSize(300,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

