import java.util.Scanner;

public class ArrayMax{
    class Location{
        int row;
        int column;
        double maxValue;
    }
    public  void showLocation(){
        Scanner input = new Scanner(System.in);
        System.out.println("输入数组行数和列数：");
        int row = input.nextInt();
        int cloum = input.nextInt();
        double[][] array = new double[row][cloum];
        System.out.println("输入数组：");
        for(int i = 0 ;i < row ;i++)
            for(int j = 0;j < cloum;j++)
                array[i][j] = input.nextDouble();
        Location where = locateLargest(array);
        show(where);
    }


    public  Location locateLargest(double[][] a){
        Location re = new Location();
        double max = a[0][0];
        int row = 0;
        int colum = 0;
        for(int i = 0;i < a.length;i++)
            for(int j = 0;j < a[i].length;j++)
                if(a[i][j] > max){
                    max = a[i][j];
                    row = i;
                    colum = j;
                }
        re.row = row;
        re.column = colum;
        re.maxValue = max;
        return re;
    }

    private  void show(Location a){
        System.out.println("这个最大的数是："+a.maxValue+"它的位置（"+a.row+","+a.column+"）");
    }
}

