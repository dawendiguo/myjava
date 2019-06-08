public class Singleton {
        private final static Singleton instance = new Singleton();

        private Singleton(){
                System.out.println("Create a Singleton Object");
        }

        public static Singleton getInstance(){
        return instance;
        }
}
