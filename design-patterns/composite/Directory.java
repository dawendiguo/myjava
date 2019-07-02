import java.util.Iterator;
import java.util.ArrayList;
public class Directory extends Entry{
        private String name;
        private ArrayList firectory = new ArrayList();

        public Directory(String name){
                this.name = name;
        }

        public int getSize(){
                int size = 0;
                Iterator it = firectory.iterator();
                while(it.hasNext()){
                        Entry entry = (Entry)it.next();
                        size += entry.getSize();
                }
                return size;
        }

        public String getName(){
        return name;
        }

        public Entry add(Entry entry){
                firectory.add(entry);
                return entry;
        }

        public void printList(String prefix){
          System.out.println(prefix+"/"+this);
          Iterator it = firectory.iterator();
          while(it.hasNext()){
                  Entry entry = (Entry)it.next();
                  entry.printList(prefix+"/"+name);
          }
        }
}
