public class DoublePrime{
    final static int NUMBER = 1000;
    public static void main(String[] args){
        for(int i = 2;i<=NUMBER;i++){
            if(doublePrime(i))
            System.out.println("( "+i+","+(i+2)+")");
        }
    }
    public static boolean doublePrime(int i ){
        boolean re = false;
        if(isPrime(i)&&isPrime((i+2)))
            re = true;
        return re;
    }

    public static boolean isPrime(int number ){
        boolean re =true;
        for(int i = 2;i<number/2+1;i++)
            if(number%i==0)
                re =false;
        return re;
    }
}
