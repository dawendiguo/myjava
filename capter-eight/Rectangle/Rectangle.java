class Rectangle{
    double width;
    double Height;
    public double getArea(){
        return width*Height;
    }
    public double getPerimeter(){
        return 2*(width+Height);
    }
    Rectangle(){
        width = 0;
        Height = 0;
    }
    Rectangle(double W,double H){
        width = W;
        Height = H;
    }
}

