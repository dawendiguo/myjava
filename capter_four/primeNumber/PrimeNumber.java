public class PrimeNumber{
    public static void main(String[] args){
        int count = 0;
        int num = 2;
        int[] prime = new int[50];

        while(count < 50){
            boolean isprime = true;
            for(int divisor = 2;divisor <= num/2;divisor++){
                if(num%divisor==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                prime[count]=num;
                num++;
                count++;
            }
            else
                num++;
        }
        for(int i=0;i<50;i++){
            System.out.printf(" %d  ",prime[i]);
            if((i+1)%10==0)
                System.out.println();
        }
    }
}
