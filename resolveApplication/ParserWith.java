package test;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ParserWith extends Applet implements ActionListener{

    TextField expText,resText;
    ParserWithVar p;

    public void init(){
        Label header =new Label("header",Label.CENTER);
        Label explab = new Label("表达式",Label.CENTER);
        Label reslab = new Label("结果",Label.CENTER);
        expText = new TextField(24);
        resText = new TextField(24);

        resText.setEditable(false);

        add(header);
        add(explab);
        add(expText);
        add(reslab);
        add(resText);

        expText.addActionListener(this);

        p=new ParserWithVar();
    }

    public  void actionPerformed(ActionEvent ex){
        repaint();
    }

    public void paint(Graphics g){
        double result=0.0;
        String expstr = expText.getText();

        try{
            if(expstr.length() != 0)
                result = p.evaluate(expstr);
            resText.setText(Double.toString(result));
            showStatus("");
        }catch(ParserException exc){
            showStatus(exc.toString());
            resText.setText("");
        }
    }
}
