import javax.swing.JOptionPane;

public class ChilrenGame{
	public static String what(int i){
		switch (i){
			case 0:
				return "石头";
			case 1:
				return "剪刀";
			case 2:
				return "布";
			default:
				return "错误";
		}
	}
	public static int reverseWhat(String youString){
		int i=0;
		if(youString.equals("石头"))
			i=0;
		else if(youString.equals("剪刀"))
			i=1;
		else if(youString.equals("布"))
			i=2;
		else 
			i=9;
		return i;
	}
	public static void main(String[] args){
		while (1>0){
			int random = (int)(Math.random()*3);
			String youString = JOptionPane.showInputDialog(null,"请输入你出什么？石头、剪刀和布");
			int  you = reverseWhat(youString);
		if(you == 9)
			break;
		if(random>you){
			if((random-you)==1){
				String output = "你赢了！你出的是"+youString+"电脑出的是"+what(random);
				JOptionPane.showMessageDialog(null,output);
			}
			else 
			{	
				String output = "你输了！你出的是"+youString+"电脑出的是"+what(random);
				JOptionPane.showMessageDialog(null,output);
			}
		}
		else{
			if((random-you)==-1){
				String output = "你输了！你出的是"+youString+"电脑出的是"+what(random);
				JOptionPane.showMessageDialog(null,output);
			}
			else if( random == you){
				String output = "你和电脑打成平手！你们都是"+youString;
				JOptionPane.showMessageDialog(null,output);
			}
			else {
				String output = "你输了！你出的是"+youString+"电脑出的是"+what(random);
				JOptionPane.showMessageDialog(null,output);
			}
		}
	}
}
}
