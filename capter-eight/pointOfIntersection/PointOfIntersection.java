class PointOfIntersection{
    class Point{
        double x;
        double y;
    };

    Point p1 = new Point();
    Point p2 = new Point();
    Point p3 = new Point();
    Point p4 = new Point();
    public void showPoint(){
    System.out.print("Enter the endpoints of the first line segment:");
    input(p1,p2);
    System.out.print("Enter the endpoints of the second line segment:");
    input(p3,p4);
    Point pointFind = findPoint(p1,p2,p3,p4);
    if(ifPointOk(pointFind,p1,p2)&&ifPointOk(pointFind,p3,p4)){
        System.out.print("线断交点是:");
        show(pointFind);
    }
    else
        System.out.println("线断上没有交点！");
    System.out.println();
    }

    private void input(Point p1, Point p2){
        java.util.Scanner input = new java.util.Scanner(System.in);
        p1.x = input.nextDouble();
        p1.y = input.nextDouble();
        p2.x = input.nextDouble();
        p2.y = input.nextDouble();
    }

    private void show(Point p){
        System.out.print("("+p.x+","+p.y+")");
    }

    private Point findPoint(Point p1,Point p2,Point p3,Point p4){
        double k1 = (p2.y-p1.y) / (p2.x - p1.x);
        double k2 = (p4.y-p3.y) / (p4.x - p3.x);
        Point re = new Point();
        re.x = (p1.y - p3.y - k1*p1.x + k2*p3.x)/(k2-k1);
        re.y = p1.y + k1*re.x - k1*p1.x;
        return re;
    }

    private boolean ifPointOk(Point on,Point p1,Point p2){
        boolean re = false;
        if(ifIn(on.x,p1.x,p2.x)&&ifIn(on.y,p1.y,p2.y))
            re = true;
        return re;
    }

    private boolean ifIn(double test,double x1,double x2){
        boolean re = false;
        if(x1>x2){
            if(test>=x2&&test<=x1)
                re = true;
        }
        else
            if(test>=x1&&test<=x2)
                re = true;
        return re;
    }
}
