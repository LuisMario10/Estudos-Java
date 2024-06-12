public interface Librarian {
    public abstract void addBook(Book book);
    public abstract Book getBook(String name);
    public abstract int searchBookId(String name);
    public abstract Book getBestAvaliable();
    public abstract void deleteBook(String name);
    public abstract void listBook();
}
