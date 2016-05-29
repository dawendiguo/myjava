public class Arrayimfibonacci{
private static final int THE_LENS = 12;
private static int[] arr = new int[THE_LENS];
private static char[] mark = new char[THE_LENS];
public static void main(String[] args){
	int hi=1;
	int lo=1;
	int count=0;
	arr[count]=hi;
	mark[count]=' ';
	count++;
	for(int i=2;i<THE_LENS;i++){
	if(hi%2==0)
		mark[count]='*';
	else 
		mark[count]=' ';
	arr[count]=hi;
	hi=lo+hi;
	lo=hi-lo;
	count++;
	}
	for(int i=0;i<count;i++)
	System.out.println(i+1+": " + arr[i] + " " + mark[i]);
	}
}	
