public class BookShelfIterator implements Iterator{
        private ListBookShelf bookshelf;
        private int index;

        public BookShelfIterator(ListBookShelf bookshelf){
                this.bookshelf = bookshelf;
                this.index = 0;
        }

        public boolean hasNext(){
                if(index < bookshelf.getLength())
                        return true;
                else
                        return false;
        }

        public Object next(){
                Book book = bookshelf.getBookAt(index);

                index++;
                return book;
        }
}
