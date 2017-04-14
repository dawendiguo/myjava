public class Rectangle extends GeometricObject{
   private  double length;
   private  double high;

    protected Rectangle(){
        this.length = 1.0;
        this.high = 1.0;
    }

    protected Rectangle(double length,double high){
        this.length = length;
        this.high = high;
    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getHigh(){
        return high;
    }
    public void setHigth(double high){
        this.high = high;
    }

    public double getArea(){
        return high*length;
    }

    public double getPerimeter(){
        return 2*(high+length);
    }
}
