/*
 * 随机生成一个数字，并通知所有观察者
 */
import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator{
        private Random random = new Random();
        private int number;

        public int getNumber(){
        return number;
        }

        public void execute(){
                for(int i = 0; i < 20;i++){
                        number = random.nextInt(50);
                        notifyObservers();
                }
        }
}
