public class Main{
        public static void main(String[] args){
                Display d1 = new Display(new StringDisplayImpl("Hello,China."));
                Display d2 = new Display(new StrongDisplayImpl("Hello,dawendigo"));
                CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello,universe."));
                RandomDisplay d4 = new RandomDisplay(1000,new StrongDisplayImpl("Hello, random show"));
                Display d5 = new Display(new StarDisplayImpl(8));
                Display d6 = new Display(new WellDisplayImpl(8));

                /*d1.display();
                d2.display();
                d3.display();
                d3.multiDisplay(4);
                d4.multiDisplay(3);
                d4.randomShow(40);
                */
                d5.display();
                d6.display();
        }
}
