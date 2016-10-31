public class RandomPickCard{
    public static void main(String[] args){
        String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        int[] card = new int[52];
        for(int i = 0;i < 52 ;i++)
            card[i]=i;
        for(int i = 0;i < 52;i++){
            int index = (int)(Math.random()*52);
            int temp = card[i];
            card[i]=card[index];
            card[index]=temp;
        }
        int count = 0;
        boolean[] allSuits = {false,false,false,false};
        for(int i =0;i<52;i++){
            System.out.println(ranks[card[i]%13]+" of "+suits[card[i]/13]);
            count++;
            if(AllDiscover(allSuits,card[i]))
                break;
            else
                continue;
        }
        System.out.println("Number of Picks : "+count);
    }
    public static boolean AllDiscover(boolean[] allSuits,int number){
        allSuits[number/13]=true;
        for(int i = 0;i < 4;i++)
            if(allSuits[i] == false)
                return false;
        return true;
    }
}
