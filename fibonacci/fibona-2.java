/*****;********************************************************************
	> File Name: fibona-2.java
	> Author: ma6174
	> Mail: ma6174@163.com 
	> Created Time: 2015年12月27日 星期日 12时08分34秒
 ************************************************************************/
class ImprovFibonacci{
	static final int MAX_INDEX = 9;
	public static void main(String[] args){
		int lo = 1;
		int hi = 1;
		String mark;
		System.out.println("1: " + lo);
		for(int i = 2;i <= MAX_INDEX;i++)
		{
			if (hi % 2 == 0)
				mark = " *";
			else 
				mark = " ";
			System.out.println(i +": "+ hi + mark);
			hi = lo + hi;
			lo = hi - lo;
		}
	}
}

