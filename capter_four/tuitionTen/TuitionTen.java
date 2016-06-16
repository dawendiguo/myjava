public class TuitionTen{
    public static void main(String[] args){
        final int YEAR = 10;
        double addPerYear = 0.05;
        double tuition = 10000.0;
        double sumofTuition = 0;

        for (int i = 0;i<YEAR;i++){
            sumofTuition += tuition;
            tuition *= (1+addPerYear);
        }
        System.out.println(YEAR+" later the Tuition add to "+tuition+" and i pay "+sumofTuition);
    }
}

