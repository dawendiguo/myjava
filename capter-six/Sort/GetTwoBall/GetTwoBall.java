public class GetTwoBall{
    public static void main(String[] args){
        final int BallNumber = 10;
        int count = 1;
        for(int i = 1;i <= BallNumber;i++){
            for(int j = BallNumber - i + 1;j<BallNumber;j++){
                System.out.println(count+":");
                System.out.println(i+"and"+j);
                count++;
            }
        }
    }
}

