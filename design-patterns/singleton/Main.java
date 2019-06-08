public class Main{
        public static void main(String[] args){
                System.out.println("Strart");
                Singleton obj1 = Singleton.getInstance();
                Singleton obj2 = Singleton.getInstance();
                if(obj1 == obj2)
                        System.out.println("obj1 and obj2 is same object");
                else
                        System.out.println("obj1 and obj2 is diffrent object");
                System.out.println("End");
        }
}
