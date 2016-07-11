public class PrimeTooPow{
    final static int NUMBER = 10000;
    public static void main(String[] args){
        System.out.println("        P       2^p - 1");
        for(int i = 2;i<=NUMBER;i++){
            if(isPrime(i)){
                if(primeN(i)!=0){
                    System.out.printf("\t%d\t%d\n",primeN(i),i);
                }
            }
        }
    }
    public static boolean isPrime(int number ) {
        boolean re = true ;
        for(int i = 2;i<number/2+1;i++){
            if(number%i==0)
                re = false;
        }
        return re;
    }

    public static int primeN(int number ) {
        int n = 0;
        for(int i = 1;Math.pow(2,i)<=number+2;i++){
            if(Math.pow(2,i)-1==number)
                n = i;
        }
        return n;
    }
}


