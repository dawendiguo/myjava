public class SchoolLocker{
    public static void main(String[] args){
        final int NuberOfStudent = 100;
        boolean[] locker = new boolean[NuberOfStudent];
        for(int i = 0;i < NuberOfStudent;i++)
            locker[i]=false;
        int currentStudent = 0;
        while(currentStudent <= NuberOfStudent){
            for(int i = currentStudent;i<NuberOfStudent;i++)
                locker[i]=back(locker[i]);
            currentStudent++;
        }
        for(int i =0 ;i<NuberOfStudent;i++)
            System.out.println("the "+(i+1)+" is : "+status(locker[i]));
    }
    public static String status( boolean sta){
        if(sta)
            return  "Open";
        else
            return "Close";
    }
    public static boolean back(boolean tt){
        if(tt)
            return false;
        else
            return true;
    }
}

