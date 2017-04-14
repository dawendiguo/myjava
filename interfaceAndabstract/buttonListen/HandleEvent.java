import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class HandleEvent extends JFrame{
    public HandleEvent(){
        JButton jbtOK = new JButton("OK");
        JButton jbtCancel = new JButton("Calcel");

        JPanel  panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));
        panel.add(jbtOK);
        panel.add(jbtCancel);

        add(panel);

        OKListenerClass listener1 = new OKListenerClass();
        CancelListenerClass listener2 = new CancelListenerClass();
        jbtOK.addActionListener(listener1);
        jbtCancel.addActionListener(listener2);
    }

    public static void main(String[] args){
        HandleEvent frame = new HandleEvent();

        frame.setTitle("Handle Event");
        frame.setSize(200,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

    class OKListenerClass implements ActionListener {
        public void actionPerformed(ActionEvent e){
            System.out.println("OK button cliked");
        }
    }

    class CancelListenerClass implements ActionListener {
        public void actionPerformed(ActionEvent e){
            System.out.println("Cancel button cliked");
            }
    }

