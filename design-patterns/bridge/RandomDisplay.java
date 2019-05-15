import java.util.Random;
public class RandomDisplay extends CountDisplay{
        private Random random ;
        private int count;

        public RandomDisplay(int sedd,DisplayImpl impl){
                super(impl);
                this.random = new Random(sedd);
        }

        public void randomShow(int maxcount){
                count = random.nextInt(maxcount);
                multiDisplay(count);
        }
}
