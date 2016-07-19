import java.util.Scanner;
public class DateAndTime{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long millisTime = System.currentTimeMillis();
        long secondsTime = millisTime/1000;
        int second = (int)secondsTime%60;
        int minutes =(int)(secondsTime/60)%60;
        int hour = (int)(secondsTime/3600)%24+8;
        int allDay = (int)(secondsTime/(3600*24))+1;
    //   System.out.println("Enter the test number: " );
     //  int allDay = input.nextInt();
        final int initYear = 1970;
        final int initmonth = 1;
        final int initDay = 1;
        int currentYear = initYear;
        int currentMonth = initmonth;
        int currentDay = initDay;
        while(allDay>(3*365+366)){
            currentYear+=4;
            allDay -= (3*365+366);
        }
        while(allDay >365){
            if(allDay > 366){
                if(isLeap(currentYear))
                    allDay-=366;
                else
                    allDay-=365;
                currentYear++;
            }
            else
                if(isLeap(currentYear))
                    break;
                else {
                    currentYear++;
                    allDay-=365;
                }
        }
       // System.out.println("The allDay is : "+allDay);
        while(allDay>31){
                allDay -= MonthDayErease(currentMonth,currentYear);
                currentMonth++;
            }
       // System.out.println("The currentMonth is :"+currentMonth);
        //System.out.println("The allDay is : "+allDay);
        if(allDay==31&&currentMonth==2||currentMonth==4||currentMonth==6||currentMonth==9||currentMonth==11){
            allDay-=30;
            currentMonth+=1;
            }
        if(allDay==30&&currentMonth==2){
            if(isLeap(currentYear)){
                allDay-=29;
                currentMonth++;
            }
            else
            {
                allDay-=28;
                currentMonth++;
            }
        }
        if(allDay==29&&currentMonth==2&&!isLeap(currentYear))
            {
                allDay-=28;
                currentMonth++;
            }
        //System.out.println("The allDay is : "+allDay);
        currentDay=allDay;
        System.out.println("The Date and Time is "+currentMonthString(currentMonth)+" "+currentDay+", "+currentYear+" "+hour+":"+minutes+":"+second);
    }
    public static String currentMonthString(int month){
        String re="";
        switch(month){
            case 1: re = "Jan";break;
            case 2: re = "Feb";break;
            case 3: re = "Mar";break;
            case 4: re = "Apr";break;
            case 5: re = "May";break;
            case 6: re = "Jun";break;
            case 7: re = "Jul";break;
            case 8: re = "Agu";break;
            case 9: re = "Sep";break;
            case 10: re = "Oct";break;
            case 11: re = "Nov";break;
            case 12: re = "Dec";break;
        }
        return re;
    }
    public static int MonthDayErease(int month,int year){
        int re = 0;
        switch(month){
            case 1:re=31;break;
            case 2:
                if(isLeap(year))
                    re = 29;
                else
                    re = 28;
                break;
            case 3:re = 31;break;
            case 4:re=30;break;
            case 5:re=31;break;
            case 6:re=30;break;
            case 7:re=31;break;
            case 8:re=31;break;
            case 9:re=30;break;
            case 10:re=31;break;
            case 11:re=30;break;
            case 12:re=31;break;
        }
        return re;
    }
    public static boolean isLeap(int year){
        boolean re = false;
        if(year%4==0&&year%100!=0||year%400==0)
            re = true;
        return re;
    }
}
