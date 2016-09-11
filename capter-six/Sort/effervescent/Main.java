public class Main{
    public static void main(String[] argv){
        double[] str={ 2,1,5,4545,23,7.8,44.5,989.6};

        Effervescent.effervescent(str);
        for(int i = 0;i < str.length;i++)
            System.out.printf("%.2f ",str[i]);
    }
}
