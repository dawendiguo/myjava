import javax.swing.JOptionPane;

public class LotteryGame{
public static void main(String[] args){

	int lottery = (int)(Math.random()*100);
	JOptionPane.showMessageDialog(null,lottery);

	String guessstring = JOptionPane.showInputDialog(null,"Enter you lottery pick (two digits: ");
	int guess = Integer.parseInt(guessstring);

	int lotterydigit1 = lottery/10;
	int lotterydigit2 = lottery%10;

	int guessdigit1 = guess/10;
	int guessdigit2 = guess%10;
	String output;
	if(guess == lottery)
		output = "Exact match : you win $10.000";
	else if(guessdigit2 == lotterydigit1&& guessdigit1 == lotterydigit2)
		output = "Match all digits : you win $3.000";
	else if(guessdigit1 == lotterydigit1||guessdigit1 == lotterydigit2||guessdigit2 == lotterydigit1 || guessdigit2 == lotterydigit2)
		output = "Match one digit: you win $1.000";
	else 
		output = "Sorry , no match";
	JOptionPane.showMessageDialog(null,output);
}
}
	
