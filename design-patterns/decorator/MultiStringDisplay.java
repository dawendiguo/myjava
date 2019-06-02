import java.util.ArrayList;
public class MultiStringDisplay extends Display{
        private ArrayList<String> str;

        public MultiStringDisplay(){
                str = new ArrayList<String>();
        }

        public void add(String str){
                this.str.add(str);
        }
        public void remove(String str){
                this.str.remove(str);
        }
        public int getRows(){
               return this.str.size();
        }
        public int getColumns(){
                int maxSize = 0;
                for(int i = 0;i < this.str.size();i++)
                        if(maxSize < this.str.get(i).length())
                                maxSize = this.str.get(i).length();
                return maxSize;
        }
        public String getRowText(int row){
                int theCount = this.str.get(row).length();
                if(theCount < getColumns())
                        return this.str.get(row)+mkplace(getColumns()-theCount);
                else
                        return this.str.get(row);
        }
        private String mkplace(int count){
                StringBuffer buf = new StringBuffer();
                for(int i = 0 ;i < count;i++)
                        buf.append(' ');
                return buf.toString();
        }
        public Object clone(){
                return this;
        }
}
