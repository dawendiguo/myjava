public class WellDisplayImpl extends DisplayImpl{
        int count;

        public WellDisplayImpl(int count){
                this.count = count;
        }

        public void rawOpen(){
                System.out.println();
        }

        public void rawPrint(){
                for(int i = 0;i < count;i++)
                  showStart(i);
        }
        public void rawClose(){
                System.out.println();
        }

        private void showStart(int i){
               System.out.print("<");
               for(int j = 0;j < i;j++)
                       System.out.print("#");
               System.out.println(">");
        }
}
