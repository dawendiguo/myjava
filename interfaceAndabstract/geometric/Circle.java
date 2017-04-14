public class Circle extends GeometricObject{
    double redius;

    protected Circle(){
        redius = 1.0;
    }
    protected Circle(double redius){
        this.redius = redius;
    }

    public double getRedius(){
        return redius;
    }

    public void setRedius(double redius){
        this.redius = redius;
    }

    public double getArea(){
        return redius*redius*Math.PI;
    }

    public double getPerimeter(){
        return redius*2*Math.PI;
    }
}

