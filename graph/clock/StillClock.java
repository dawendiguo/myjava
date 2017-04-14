import javax.swing.*;
import java.awt.*;
import java.util.*;

public class StillClock extends JPanel{
    private int hour;
    private int minute;
    private int second;

    public StillClock(){
        setCurrentTime();
    }

    public StillClock(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getMinute(){
        return minute;
    }
    public void setMinute(int minute){
        this.minute = minute;
        repaint();
    }

    public int getHour(){
        return hour;
    }
    public void setHour(int hour){
        this.hour = hour;
        repaint();
    }

    public void setSecond(int second){
        this.second = second;
        repaint();
    }
    public int getSecond(){
        return second;
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        int clockRadius = (int)(Math.min(getWidth(),getHeight())*0.8*0.5);

        int xCenter = getWidth()/2;
        int yCenter = getHeight()/2;


        g.setColor(Color.BLACK);
        g.drawOval(xCenter-clockRadius,yCenter-clockRadius,2*clockRadius,2*clockRadius);
        g.drawString("12",xCenter-5,yCenter-clockRadius+12);
        g.drawString("9",xCenter-clockRadius+3,yCenter+5);
        g.drawString("6",xCenter-3,yCenter+clockRadius-3);
        g.drawString("3",xCenter+clockRadius-10,yCenter+3);

        int sLength = (int)(clockRadius*0.8);
        int xSecond = (int)(xCenter + sLength * Math.sin(second*(2*Math.PI/60)));
        int ySecond = (int)(yCenter - sLength * Math.cos(second*(2*Math.PI/60)));
        g.setColor(Color.BLUE);
        g.drawLine(xCenter,yCenter,xSecond,ySecond);

        int mLength = (int)(clockRadius * 0.65);
        int xHour = (int)(xCenter + mLength * Math.sin(minute * (2*Math.PI / 60)));
        int yHour = (int)(xCenter + mLength * Math.cos(minute * (2*Math.PI/60)));

        g.setColor(Color.GREEN);
        g.drawLine(xCenter,yCenter,xHour,yHour);
    }

    public void setCurrentTime(){
        Calendar calendar = new GregorianCalendar();

        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    public Dimension GetPreFerredSize(){
        return new Dimension(200,200);
    }
}
