import java.util.Scanner;

public class AnswerDay{
	public static String theday(int day){
		switch (day){
			case 0:
				return "星期天";
			case 2:
				return "星期二";
			case 3:
				return "星期三";
			case 4:
				return "星期四";
			case 5:
				return "星期五";
			case 6:
				return "星期六";
			case 1:
				return "星期一";
			default:
				return "错误";
		}
	}
	public static int day(int y,int m,int d){
		int h = 0;
		h = y%100 +y%100/4 + y/400 - 2*(int)(y/100) +(int)(26*(m+1)/10) + d -1;
		while (h<0)
			h+=7;
		int re = h%7;
		return re;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入要算的年份、月份和第几天");
		int year = input.nextInt();
		int month = input.nextInt();
		int day = input.nextInt();
		if(month < 3 ){
			month += 12;
			year--;
		}
		int theone = day(year,month,day);
		System.out.println("这一天是"+theday(theone));
	}
}
