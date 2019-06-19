import java.util.List;
import java.util.ArrayList;
public class ListBookShelf implements Aggregate{
      private List<Book> bookList = null;

      public ListBookShelf(){
              bookList = new ArrayList<Book>();
      }
      
      public Book getBookAt(int index){
              if(index < bookList.size())
                      return bookList.get(index);
              else
                      return null;
      }

      public void appendBook(Book book){
              bookList.add(book);
      }
      public int getLength(){
      return bookList.size();
      }

      public Iterator iterator(){
              return new BookShelfIterator(this);
      }
}
