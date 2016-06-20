public class ExpCaculate{
    public static void main(String[] args){

        final int NUMBER = 1000;
        double sum = 0 ;
        double  njie = 1;
        int n = 1;
        while(n<NUMBER){
            int i = 1;
            njie = 1;

            while(i < n){
                njie*=i;
                i++;
            }

            System.out.println("njie is "+n +"  "+njie);
            sum = 1.0/njie +sum;
            n++;
        }
        System.out.println("The Exp is:"+sum);
    }
}
