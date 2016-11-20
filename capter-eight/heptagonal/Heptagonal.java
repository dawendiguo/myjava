public class Heptagonal{
    int n;
    double side;
    private double x;
    private double y;
    Heptagonal(){
        n = 0;
        side = 1;
        x = 0;
        y = 0;
    }
    Heptagonal(int nside ,double s){
        n = nside;
        side = s;
        x = 0;
        y = 0;
    }

    Heptagonal(int nside,double s,int xpoint,int ypoint){
        n = nside;
        side = s;
        x = xpoint;
        y = ypoint;
    }
    public int getN(){
        return n;
    }
    public void setN(int nside){
        n = nside;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double s ){
        side = s;
    }
    public double getX(){
        return x;
    }
    public void setX(double xpoint){
        x = xpoint;
    }
    public double getY(){
        return y;
    }
    public void setY(double ypoint){
        y = ypoint;
    }
    public double getPerimeter(){
        return n*side;
    }
    public double getArea(){
        return (n*side*side)/(4*Math.tan(Math.PI/n));
    }
}

