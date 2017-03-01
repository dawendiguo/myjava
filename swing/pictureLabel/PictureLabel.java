import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class PictureLabel extends JFrame{
    PictureLabel(){
    ImageIcon pic1 = new ImageIcon("./pic1.jpg");
    ImageIcon pic2 = new ImageIcon("./pic2.jpg");
    ImageIcon pic3 = new ImageIcon("./pic3.png");
    ImageIcon pic4 = new ImageIcon("./pic4.jpg");

    JLabel jlb1 = new JLabel(pic1);
    JLabel jlb2 = new JLabel(pic2);
    JLabel jlb3 = new JLabel(pic3);
    JButton  jlb4 = new JButton(pic4);

    LineBorder line = new LineBorder(Color.BLACK,5);

    jlb1.setBorder(line);
    jlb2.setBorder(line);
    jlb3.setBorder(line);
    jlb4.setBorder(line);
    jlb3.setToolTipText("This is the forth counch");

    setLayout(new GridLayout(2,2,10,10));
    add(jlb1);
    add(jlb2);
    add(jlb3);
    add(jlb4);
    }

    public static void main(String[] args){
        PictureLabel frame = new PictureLabel();
        frame.setTitle("Pic!");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
