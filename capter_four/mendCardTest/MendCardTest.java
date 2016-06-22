public class MendCardTest{
    public static void main(String[] args){
        final int NNMBEROFTEST=1000000;
        int count = 0;
        for(int i = 0;i<NNMBEROFTEST;i++){
            double n1 = (Math.random()*2)-1;
            double n2 = (Math.random()*2)-1;
            if(n1 < 0)
                count++;
            else if(n2 < (1-n1)&&n1>0&&n2>0)
                count ++;
            else
                continue;
        }
        double point =count*1.0/NNMBEROFTEST*100;
        System.out.printf("The poseeble of point in 1`3 is %f%%\n",point);
    }
}
