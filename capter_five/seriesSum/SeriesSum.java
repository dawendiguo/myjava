public class SeriesSum{
    public static double seriesSum(int number){
        double sum = 0;
        for(int i = 1;i <= number;i++){
            sum += (double)i/(i+1);
        }
        return sum;
    }
}
