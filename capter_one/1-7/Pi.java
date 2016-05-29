public class Pi{
public static void main(String[] args){
double p=0;
int flag=-1;
for(int i=1;i<999999;i+=2){
	flag*=(-1);
	p+=4.0/i*flag;
}
System.out.printf("pi=%.18f%n",p);
}
}
