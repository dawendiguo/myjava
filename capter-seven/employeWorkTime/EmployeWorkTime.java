import java.util.Scanner;

public class EmployeWorkTime{
    static final int NUMBER_OF_WEEK = 7;
    static final int NUMBER_OF_EMPLOYE = 8;
    public static void main(String[] args){
        int[][] times = inputTime();
        sortTotalTime(times);
    }

    static int[][] inputTime(){
        Scanner input = new Scanner(System.in);

        int[][] times = new int[NUMBER_OF_EMPLOYE][NUMBER_OF_WEEK+1];
        System.out.println("           Su M T W H F Sa");
        for(int i = 0;i < NUMBER_OF_EMPLOYE;i++){
            times[i][0] = i;
            System.out.print("Employer "+times[i][0]);
            for(int j = 1;j < NUMBER_OF_WEEK+1;j++){
                times[i][j] = input.nextInt();
        }
        }
        return times;
    }

    static void sortTotalTime(int[][] times){
        int[][] temp = new int[NUMBER_OF_EMPLOYE][NUMBER_OF_WEEK+2];
      //  System.arraycopy(times,0,temp,0,times.length);
        for(int i = 0;i < times.length;i++){
            for(int j = 0;j < times[0].length;j++){
                temp[i][j] = times[i][j];
            }
        }
        for(int i = 0 ;i < temp.length;i++){
            int sum = 0;
            for( int j = 1; j < NUMBER_OF_WEEK+1;j++){
                sum += temp[i][j];
            }
            temp[i][NUMBER_OF_WEEK+1]=sum;
        }
        display(temp);
        for(int i = 0;i < NUMBER_OF_EMPLOYE;i++){
            for(int j = i+1;j < NUMBER_OF_EMPLOYE;j++){
                if(temp[i][NUMBER_OF_WEEK+1]<temp[j][NUMBER_OF_WEEK+1])
                    chang(temp,i,j);
            }
        }

        display(temp);
    }

    static void display(int[][] timesTotal){
        System.out.println("          Su  M  T  W  H  F  Sa  Total");
        for(int i = 0;i < timesTotal.length;i++){
            System.out.print("Employe ");
            for(int j = 0;j < timesTotal[0].length;j++)
                System.out.print("  "+timesTotal[i][j]);
            System.out.println();
        }
    }

    static void chang(int[][] timesTotal,int i,int j){
        int[] temp = new int[timesTotal[0].length];
        for(int a = 0;a < temp.length;a++)
            temp[a]=timesTotal[j][a];
        for(int a = 0;a < temp.length;a++)
            timesTotal[j][a]=timesTotal[i][a];
        for(int a = 0;a < temp.length;a++)
            timesTotal[i][a] = temp[a];
    }
}
