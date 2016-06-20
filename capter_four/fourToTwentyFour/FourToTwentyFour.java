public class FourToTwentyFour{
    public static void main(String[] args){
    double sum = 0;
        for (int i = 1;i < 100;i+=2){
            int j = i+2;
            sum = (double)i/j + sum;
        }
        System.out.println("The sum is:"+sum);
    }
}

