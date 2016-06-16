public class RandomUper{
	public static void main(String[] args){
		int c =(int)(Math.random()*26)+(int)'A';
		char ch = (char)c;

		System.out.println("这个随机产生的字母是"+ch);
	}
}
