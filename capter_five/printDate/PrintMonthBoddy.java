public class PrintMonthBoddy{
    public static void printMonthBoddy(int year,int month){
        int startDay = getStartDay(year,month);

        int numberOfDaysInMonth = getNumberDays(year,month);

        int i = 0;
        for(i = 0;i<startDay;i++)
            System.out.print("     ");
        for(i = 1;i<=numberOfDaysInMonth;i++){
            System.out.printf("%5d",i);
            if((i+startDay)%7==0)
                System.out.println();
        }
        System.out.println();
    }
    public static int getNumberDays(int year,int month){
        int re = 0;
        if(month ==  1||month == 3 || month == 5 ||month == 7||month == 8 ||month ==10||month == 12)
            re = 31;
        if(month == 4 || month == 6 ||month == 9 ||month ==11)
            re =  30;
        else if (month == 2){
        if(isLeapYear(year))
             re = 29;
        else
            re = 28;
        }
        return re;

    }
    public static boolean isLeapYear(int year){
        return ((year%4==0&&year%100!=0)||(year%400==0));
    }
    public static int getStartDay(int year,int month){
        final int START_DAY_FOR_JAN_1_1800 = 3;

        int totalNumberDays  = getTotalNumberOfDays(year,month);

        return ((totalNumberDays + START_DAY_FOR_JAN_1_1800) % 7);
    }

    public static int getTotalNumberOfDays(int year,int month){
    int total = 0;
    for(int i=1800;i<year;i++){
        if(isLeapYear(i))
            total+=366;
        else
            total+=365;
    }
    for(int i = 1;i<month;i++){
        total = total + getNumberDays(year,i);
    }
    return total;
    }
}



