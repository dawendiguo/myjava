public class Sum{
public static void main(String[] args){
int sum=0;
for(int i=1;i<10;i++){
	sum+=i;
	System.out.printf("%d + ",i);
}
System.out.printf(" = %d%n",sum);
}
}
