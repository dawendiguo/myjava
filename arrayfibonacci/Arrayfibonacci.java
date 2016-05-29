public class Arrayfibonacci{
private static final int THE_LENS = 10;
public static int[] arr = new int[THE_LENS];
public static void main(String[] args){
	int lo=1;
	int hi=1;
	int count=0;
	arr[count]=hi;
	count++;
	for(int i=2;i<THE_LENS;i++){
	arr[count]=hi;
	hi=lo+hi;
	lo=hi-lo;
	count++;
	}
	for(int i=0;i<count;i++)
	System.out.println(arr[i]);
}}
