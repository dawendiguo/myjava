public class Effervescent{
    public static void effervescent(double[] name){
        int lenth = name.length;
        while(lenth > 1){
            for(int i = 0 ;i < lenth-1;i++){
                if(name[i] > name[i+1])
                {
                    double temp = name[i+1];
                    name[i+1] = name[i];
                    name[i] = temp;}
            }
            lenth--;
        }
    }
}

