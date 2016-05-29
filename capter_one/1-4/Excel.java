public class Excel{
	public static void main(String[] args){
	System.out.println("	a	a^2	a^3");
	for(int i = 1;i<5;i++){
		for(int j=1;j<4;j++){
		System.out.printf("	%.0f",Math.pow(i,j));
		}
		System.out.printf("%n");
	}
}
}
