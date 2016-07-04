public class SeriesAdd{
    public static double seriesAdd(int number){
        double  sum = 0;
        for(int i = 1;i<= number;i += 2)
            sum = 1.0/(2*i-1)-1.0/(2*i+1) + sum;
        sum *= 4;
        return sum;
    }
}

