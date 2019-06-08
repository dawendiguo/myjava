public class Main{
        public static void main(String[] args){
                Triple t1 = Triple.getInstance(1);
                System.out.printf("Triple 1 Number: %d\n",t1.getNumber());
                t1.setNumber(111);
                System.out.printf("Triple 1 Number: %d\n",t1.getNumber());
                Triple t2 = Triple.getInstance(2);
                Triple t3 = Triple.getInstance(3);
                t2.setNumber(222);
                t3.setNumber(333);
                System.out.printf("Triple 1 Number: %d\n",t1.getNumber());
                System.out.printf("Triple 2 Number: %d\n",t2.getNumber());
                System.out.printf("Triple 3 Number: %d\n",t3.getNumber());
                Triple t11 = Triple.getInstance(1);
                Triple t22 = Triple.getInstance(2);
                Triple t33 = Triple.getInstance(3);
                System.out.printf("Triple 11 Number: %d\n",t11.getNumber());
                System.out.printf("Triple 22 Number: %d\n",t22.getNumber());
                System.out.printf("Triple 33 Number: %d\n",t33.getNumber());
        }
}
