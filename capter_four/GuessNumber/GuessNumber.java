import java.util.Scanner;

public class GuessNumber{
    final static int number = (int)(Math.random()*100);
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100"+'\n');
        do{
            System.out.printf("Enter your guess:");
            int guess = input.nextInt();
            if(guess<number)
                System.out.println("Your guess is too low");
            else if(guess>number)
                System.out.println("Your guess is too high");
            else{
                System.out.println("Yes the number is "+ number);
                break;
            }
        }while(true);
    }
}


