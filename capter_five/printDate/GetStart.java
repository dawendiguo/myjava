public class GetStart{
    public static int getStartDay(int year,int month){
        final int START_DAY_FOR_JAN_1_1800 = 3;

        int totalNumberDays  = getTotalNumberOfDays(year,month);

        return (totalNumberDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    public static int getTotalNumberOfDays(int year,int month){
    int total = 0;
    for(int i=1800;i<year;i++){
        if(PrintMonthBoddy.isLeapYear(i))
            total+=366;
        else
            total+=365;
    }
    for(int i = 1;i<month;i++){
        total = total + PrintMonthBoddy.getNumberDays(year,i);
    }
    return total;
}
}
