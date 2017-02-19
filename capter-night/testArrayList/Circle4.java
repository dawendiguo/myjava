public class Circle4 extends Object{
    private double redius;
    Circle4(){
        redius = 1.0;
    }
    Circle4(double r){
        redius = r;
    }

    public  double getRedius(){
        return redius;
    }
    public  void setRedius(double r){
        redius = r;
    }

    public  double getArea(){
        return redius*redius*Math.PI;
    }

    public  double getDiameter(){
        return redius*2*Math.PI;
    }
}
