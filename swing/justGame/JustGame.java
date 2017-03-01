import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class JustGame extends JFrame{
    public JustGame(){
        ImageIcon[] pic = new ImageIcon[3];

        pic[0] = new ImageIcon("./pic1.png");
        pic[1] = new ImageIcon("./pic2.png");
        pic[2] = new ImageIcon("./pic3.png");

        JLabel[] jlb = new JLabel[9];
        for(int i = 0 ;i < 9;i++)
            jlb[i] = new JLabel(pic[(int)(Math.random()*3)]);

        setLayout(new GridLayout(0,3));
        for(int i = 0 ;i < 9;i++){
            add(jlb[i]);
        }
    }


    public static void main(String[] args){
        JustGame frame = new JustGame();
        frame.setTitle("just a game");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

