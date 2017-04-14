import javax.swing.*;
import java.awt.*;

public class ImageViewer extends JFanel{
    private Java.awt.Image Image;
    private boolean stretched = true;

    private int xCoordinate;

    private int yCoordinate;

    public ImageViewer(){
    }

    public ImageViewer(Image image){
        this.image = image;
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        if(image != null)
            if(isStretched())
                g.drawImage(image.xCoordinate,yCoordinate,getWidth(),getHeight(),this);
            else
                g.drawImage(image,xCoordinate,yCoordinate,this);
    }

    public java.awt.Image getImage(){
        return image;
    }

    public void setImage (java.awt.Image image){
        this.image = image;
        repaint();
    }

