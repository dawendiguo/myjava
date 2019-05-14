import java.util.Random;

public class WinningStrategy implements Strategy{
        private Random random;
        private boolean win = false;
        private Hand prevHand;
        public WinningStrategy(int seed){
                random = new Random(seed);
        }

        public Hand nextHand(){
                if(!win)
                        prevHand = Hand.getHand(random.nextInt(3));

                return prevHand;
        }

        public void study(boolean win){
                this.win = win;
        }
}
