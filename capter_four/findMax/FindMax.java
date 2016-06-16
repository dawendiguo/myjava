public class FindMax{
    public static void main(String[] args){
        final int NUMBER = 12000;
        int i=(int)(Math.sqrt(NUMBER));

        while(i*i*i>NUMBER){
            i--;

        }
        System.out.println("The Max number is "+i+" ^3 > "+NUMBER);
    }
}


