import java.util.Scanner;

public class PickCard{
      final static String[] number={"Ace","2","3","4","5","6","7","8","9","10","jack","Queen","King"};
     final static  String[] follower={"Clubs","Diamond","Heart","Sqades"};

    public static void main(String[] args){
    //String[] number={"Ace","2","3","4","5","6","7","8","9","10","jack","Queen","King"};
    //String[] follower={"Clubs","Diamond","Heart","Sqades"};
        Scanner input = new Scanner(System.in);
       do
       {System.out.printf("If you want random pick a card?(yes or no)");
           String test = input.nextLine();
           if(test.equals("yes")){
               int n = (int)(Math.random()*13);
               int f = (int)(Math.random()*4);
               System.out.println("you random pick card is "+number[n]+" of "+follower[f]);
            }
           else
               break;
       }while(1>0);
    }
}

