import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class MyGridLayout extends JFrame{
    public MyGridLayout(){
        setLayout(new GridLayout(3,2,5,5));

        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(1));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
    }

    public static void main(String[] args){
        MyGridLayout frame = new MyGridLayout();

        frame.setTitle("ShowGridLayout");
        frame.setSize(200,125);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

