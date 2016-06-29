public class PrintMonth{
    public static void printMonth(int year,int month){
        printMonthTitle(year,month);
        PrintMonthBoddy.printMonthBoddy(year,month);
    }
    public static void printMonthTitle(int year,int month){
        System.out.println("            "+getMonthName(month)+" "+year);
        System.out.println("-------------------------------------");
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat ");
    }
    public static String getMonthName(int month){
        String monthName = "";
        switch(month){
            case 1: monthName =  "January";break;
            case 2: monthName =  "February";break;
            case 3: monthName =  "March";break;
            case 4: monthName =  "April";break;
            case 5: monthName =  "May";break;
            case 6: monthName =  "June";break;
            case 7: monthName =  "July";break;
            case 8: monthName =  "August";break;
            case 9: monthName =  "September";break;
            case 10: monthName =  "October";break;
            case 11: monthName =  "November";break;
            case 12: monthName =  "December";
        }
        return monthName;
    }
}
