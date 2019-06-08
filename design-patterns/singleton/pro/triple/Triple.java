public class Triple{
        private static Triple instance1 = new Triple();
        private static Triple instance2 = new Triple();
        private static Triple instance3 = new Triple();
        private int number = 1000;

        private Triple(){}

        public void setNumber(int num){
                this.number = num;
        }
        public int getNumber(){return this.number;}

        public static Triple getInstance(int id){
                switch(id){
                        case 1:
                                return instance1;
                        case 2:
                                return instance2;
                        case 3:
                                return instance3;
                        default:
                                return null;
                }
        }
}
