import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class TestCommon extends JFrame{
    public TestCommon(){
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT,2,2));
        JButton jbtleft = new JButton("Left");
        JButton jbtCenter = new JButton("Center");
        JButton jbtRight = new JButton("Right");
        jbtleft.setBackground(Color.WHITE);
        jbtCenter.setForeground(Color.GREEN);
        jbtRight.setToolTipText("This a right button");
        p1.add(jbtleft);
        p1.add(jbtCenter);
        p1.add(jbtRight);
        p1.setBorder(new TitledBorder("Three Buttons"));

        Font largeFont = new Font("TimesRoman",Font.BOLD,20);
        Border lineBorder = new LineBorder(Color.BLACK,2);

        JPanel p2 = new JPanel(new GridLayout(1,2,5,5));
        JLabel jlb1Red = new JLabel("Red");
        JLabel jlb1Orange = new JLabel("Orange");
        jlb1Red.setForeground(Color.RED);
        jlb1Orange.setForeground(Color.ORANGE);
        jlb1Red.setFont(largeFont);
        jlb1Orange.setFont(largeFont);
        jlb1Red.setBorder(lineBorder);
        jlb1Orange.setBorder(lineBorder);
        p2.add(jlb1Red);
        p2.add(jlb1Orange);
        p2.setBorder(new TitledBorder("Two labels"));
        setLayout(new GridLayout(2,1,5,5));
        add(p1);
        add(p2);
    }

    public static void main(String[] args){
        JFrame frame = new TestCommon();

        frame.setTitle("TestSwingCommonFeatures");
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
