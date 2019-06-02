public class UpDownBorder extends Border{
        private char charBorder;

        public UpDownBorder(Display display,char charBorder){
                super(display);
                this.charBorder = charBorder;
        }

        public int getRows(){
               return 1+display.getRows()+1;
        }
        public int getColumns(){
               return display.getColumns();
        }
        public String getRowText(int row){
                if(row == 0)
                        return makeLine(display.getColumns());
                else if(row == display.getRows()+1)
                        return makeLine(display.getColumns());
                else  
                        return display.getRowText(row-1);
        }

        private String makeLine(int count){
                StringBuffer buf = new StringBuffer();
                for(int i = 0 ;i < count;i++)
                        buf.append(this.charBorder);
                return buf.toString();
        }   
}
