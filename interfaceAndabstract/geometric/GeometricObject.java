public abstract class GeometricObject{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreate;

    protected GeometricObject(){
        dateCreate = new java.util.Date();
    }

    protected GeometricObject(String color,boolean filled){
        dateCreate = new java.util.Date();
        this.filled = filled;
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean IsFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public java.util.Date getDateCreate(){
        return dateCreate;
    }

    public String toString(){
        return "Created on " + dateCreate + "\ncolor : " +color +"and filled: "+filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
