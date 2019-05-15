public class StrongDisplayImpl extends DisplayImpl{
        private String string;
        int width;
        public StrongDisplayImpl(String string){
                this.string = string;
                width = string.getBytes().length;
        }

        public void rawOpen(){
                showLine();
        }

        public void rawPrint(){
                System.out.println("[" + string + "]");
        }

        public void rawClose(){
                showLine();
        }

        private void showLine(){

                System.out.print("+");
                for(int i = 0 ;i < width;i++)
                        System.out.print("*");
                System.out.println("+");
        }
}
