import java.awt.*;
import javax.swing.*;

public class TestMessagePanel extends JFrame{
    public TestMessagePanel(){
        MessagePanel mesagePanel1 = new MessagePanel("Welcome to Java");
        MessagePanel mesagePanel2 = new MessagePanel("Java is fun");
        MessagePanel mesagePanel3 = new MessagePanel("Java is cool");
        MessagePanel mesagePanel4 = new MessagePanel("I Love Java");

        mesagePanel1.setFont(new Font("SansSerif",Font.ITALIC,20));
        mesagePanel2.setFont(new Font("Courier",Font.BOLD,20));
        mesagePanel3.setFont(new Font("Times",Font.ITALIC,20));
        mesagePanel4.setFont(new Font("Californian FB",Font.PLAIN,20));
        mesagePanel1.setBackground(Color.RED);
        mesagePanel2.setBackground(Color.CYAN);
        mesagePanel3.setBackground(Color.GREEN);
        mesagePanel4.setBackground(Color.WHITE);

        mesagePanel1.setCentered(true);


        setLayout(new GridLayout(2,2));
        add(mesagePanel1);
        add(mesagePanel2);
        add(mesagePanel3);
        add(mesagePanel4);
    }

    public static void main(String[] args){
        TestMessagePanel frame = new TestMessagePanel();
        frame.setTitle("TestMessagePanel");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
