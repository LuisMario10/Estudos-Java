import java.util.ArrayList;

public class Library implements Librarian {
    private ArrayList<Book> listBook;
    public int size;

    public Library() {
        this.listBook = new ArrayList<Book>();
        this.size = 0;
    }

    public void addBook(Book book) {
        this.listBook.add(book);
    }

    public Book getBook(String name) {
        int id = this.searchBookId(name);
        return this.listBook.get(id);
    }

    public int searchBookId(String name) {
        for(int i = 0; i < this.size; i++) {
            if(this.listBook.get(i).getName() == name) {
                return i;
            }
        }
        return -1;
    }

    public Book getBestAvaliable() {
        Book aux = this.listBook.get(0);
        for(int i = 0; i < this.size; i++) {
            if(aux.getAvaliable() < this.listBook.get(i).getAvaliable()) {
                aux = this.listBook.get(i);
            }
        }
        return aux;
    }

    public void deleteBook(String name) {
        int id = this.searchBookId(name);
        this.listBook.remove(id);
    }

    public void listBook() {
        for(Book b: this.listBook) {
            b.status();
        }
    }
}
