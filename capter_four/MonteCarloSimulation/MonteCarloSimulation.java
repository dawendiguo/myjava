public class MonteCarloSimulation{
    public static void main(String[] args){
        final long NUMBER_OF_PRIALS = 100000000;
        long numberOfHits = 0;

        for(long i=0;i < NUMBER_OF_PRIALS;i++){
        double x =(Math.random()*2.0 - 1);
        double y =(Math.random()*2.0 - 1);
        if(x*x+y*y<=1)
            numberOfHits++;
    }
    System.out.println("the number is " + numberOfHits+"and the all " + NUMBER_OF_PRIALS);
    double pi = 4.0*numberOfHits/NUMBER_OF_PRIALS;
    System.out.println("out test pi is:"+pi);
    }
}
