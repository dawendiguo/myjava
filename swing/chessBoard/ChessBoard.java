import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class ChessBoard extends JFrame{
    public ChessBoard(){
        setLayout(new GridLayout(8,8));

        JButton[] jb = new JButton[64];

        for(int i = 0 ;i < 64;i++)
            jb[i] = new JButton();
        for(int i = 0 ;i < 8;i++){
            for(int j = 0;j < 8;j++){
            if((i+j)%2 == 0)
                jb[(i*8)+j].setBackground(Color.WHITE);
            else
                jb[(i*8)+j].setBackground(Color.BLACK);
        }
        }

        for(int i = 0;i < 64;i++)
            add(jb[i]);
    }

    public static void main(String[] args){
        ChessBoard frame = new ChessBoard();

        frame.setTitle("我的棋盘");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
