public class FindMini{
    public static void main(String[] args){
        final int NUMBER = 12000;

        int i = 0;

        while(i*i<12000){
            i++;
        }
        System.out.println("The mini number can make "+i+"^2 < "+NUMBER);
    }
}

