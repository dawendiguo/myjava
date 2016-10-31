public class TwentyFourGame{
    public static void main(String[] args){
        int[] card = new int[52];

        for(int i = 0 ;i < 52;i++)
            card[i]=i;
        int count = 0;
        while(count < 1000){
            count++;
          shuffleDeck(card);
            if(card[0]%13+card[1]%13+card[2]%13+card[3]%13 == 20)
                     System.out.println(count+":\n"+toString(card[0])+toString(card[1])+toString(card[2])+toString(card[3]));
        }
    }

  static  void shuffleDeck(int[] card){
        for(int i = 0;i < 52;i++){
           int  index = (int)(Math.random()*52);
            int temp = card[index];
            card[index] = card[i];
            card[i] = temp;
        }
    }
    static String toString(int x){
        final String[] suits = {"Spades","Hearts","Diamods","clubs"};
        final String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        return suits[x/13]+"    "+ranks[x%13]+"\n";
    }
}

