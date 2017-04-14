import javax.swing.*;
import java.awt.*;

public class DisplayClock extends JFrame{
    public DisplayClock(){
        StillClock clock = new StillClock();

        MessagePanel message = new MessagePanel(clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond());

        message.setCentered(true);
        message.setForeground(Color.BLUE);
        message.setFont(new Font("Courier",Font.BOLD,16));

        add(clock);
        add(message,BorderLayout.SOUTH);
    }

    public static void main(String[] args){
        DisplayClock frame = new DisplayClock();

        frame.setTitle("成都时间");
        frame.setSize(300,350);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
