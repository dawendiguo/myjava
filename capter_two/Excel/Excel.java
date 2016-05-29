import javax.swing.JOptionPane;

public class Excel{
public static void main(String[] args){
String output = "a\tb\tpow(a,b)";
for(int a = 1, b = 2;a < 6;a++,b++){
	output += "\n" + a +"\t" + b +"\t" + Math.pow(a,b) ;
}
JOptionPane.showMessageDialog(null,output);
}
}

