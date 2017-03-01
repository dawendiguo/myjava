import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class MyCommon extends JFrame{
    public MyCommon(){
        setLayout(new GridLayout(2,3));

        JButton black = new JButton("Black");
        black.setForeground(Color.BLACK);
        black.setBackground(Color.WHITE);
        JButton blue = new JButton("blue");
        blue.setForeground(Color.BLUE);
        blue.setBackground(Color.WHITE);
        JButton cyan = new JButton("cyan");
        cyan.setForeground(Color.CYAN);
        cyan.setBackground(Color.WHITE);
        JButton green = new JButton("green");
        green.setForeground(Color.GREEN);
        green.setBackground(Color.WHITE);
        JButton red = new JButton("red");
        red.setForeground(Color.RED);
        red.setBackground(Color.WHITE);
        JButton orange = new JButton("orange");
        orange.setForeground(Color.ORANGE);
        orange.setBackground(Color.WHITE);

        Font largeFont = new Font("TimesRoman",Font.BOLD,20);

        black.setFont(largeFont);
        blue.setFont(largeFont);
        cyan.setFont(largeFont);
        green.setFont(largeFont);
        red.setFont(largeFont);
        orange.setFont(largeFont);

        add(black);
        add(blue);
        add(cyan);
        add(green);
        add(red);
        add(orange);
    }

    public static void main(String[] args){
        MyCommon frame = new MyCommon();

        frame.setTitle("My own common test!");
        frame.setSize(400,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
