public class Rectangle1{
    private double length;
    private double high;

    Rectangle1(){
        length = 1;
        high = 1;
    }
    Rectangle1(double l,double h){
        length = l;
        high = h;
    }

    public  double getLength(){
        return length;
    }
    public  double getHigh(){
        return high;
    }

    public  void setLength(double l){
        length = l;
    }
    public  void setHigh(double h){
        high = h ;
    }

    public  double getArea(){
        return length*high;
    }
    public  double getDiameter(){
        return 2*(length+high);
    }
}
