public class NotReversePrime{
    public static void main(String[] args){
    notReverPrimeprint();
    }
    public static void notReverPrimeprint(){
    int count = 1;
    int i = 2;
    while(count<101){
        if(ReversePrime.isPrime(i)&&notIsReverse(i)){
            if(count%4==0){
                System.out.printf("%8d\n",i);
                count++;
            }
            else {
                System.out.printf("%8d",i);
                count++;
            }
        }
        i++;
    }
    System.out.println();
    }
    public static boolean notIsReverse(int number){
        return number != ReversePrime.reverse(number);
    }
}
