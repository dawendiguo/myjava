public class Main{
        public static void main(String[] args){
        NumberGenerator generator1 = new IncrementalNumberGenerator(10,50,5);
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer = new DigitObserver();
        Observer observer2 = new GraphObserver();

        generator.addObserver(observer);
        generator.addObserver(observer2);
        generator1.addObserver(observer);
        generator1.addObserver(observer2);

        generator1.execute();
        }
}
