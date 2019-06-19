public class Main {
        public static void main(String[] args){
                ListBookShelf bookshelf = new ListBookShelf();
                bookshelf.appendBook(new Book("Around the world in 80 days"));
                bookshelf.appendBook(new Book("Bible"));
                bookshelf.appendBook(new Book("Bible"));
                bookshelf.appendBook(new Book("Cinderella"));
                bookshelf.appendBook(new Book("Daddy-Long-Legs"));
                bookshelf.appendBook(new Book("Daddy-Long-Legs"));
                bookshelf.appendBook(new Book("Daddy-Long-Legs"));
                bookshelf.appendBook(new Book("Around the world in 80 days"));
                bookshelf.appendBook(new Book("Around the world in 80 days"));

                Iterator it = bookshelf.iterator();
                while(it.hasNext()){
                        Book book = (Book)it.next();
                        System.out.println(book.getName());
                }
        }
}
