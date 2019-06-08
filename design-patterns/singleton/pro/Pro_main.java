public class Pro_main{
        public static void main(String[] args){
                if(args.length != 0)
                        System.exit(127);
                else{
                        Pro_TicketMaker maker1 = Pro_TicketMaker.getInstance();
                        Pro_TicketMaker maker2 = Pro_TicketMaker.getInstance();
                        Pro_TicketMaker maker3 = Pro_TicketMaker.getInstance();
                        System.out.printf("Maker1 ticker : %d\n",maker1.getNextTicketNumber());
                        System.out.printf("Maker1 ticker : %d\n",maker2.getNextTicketNumber());
                        System.out.printf("Maker1 ticker : %d\n",maker3.getNextTicketNumber());
                }
                System.exit(0);
        }
}
