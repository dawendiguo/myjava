public class Pro_TicketMaker{
        private static Pro_TicketMaker instance = new Pro_TicketMaker();
        private int ticket = 1000;

        private Pro_TicketMaker(){
        }

        public static Pro_TicketMaker getInstance(){
        return instance;
        }

        public int getNextTicketNumber(){
                return this.instance.ticket++;
        }
}
