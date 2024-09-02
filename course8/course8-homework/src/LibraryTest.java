import java.util.*;

public class LibraryTest {
    private ArrayList<Book> books;
    private TreeMap<Book, Integer> bookMap;

    public LibraryTest() {
        books = new ArrayList<>();
        bookMap = new TreeMap<>(Comparator.comparingInt(o -> o.year));
    }

    public void addBook(Book book) {
        books.add(book);
        bookMap.put(book, book.year);
    }

    public Book printOldestBookByYear(int year) {
        Book oldestBook = bookMap.navigableKeySet().stream().filter(book -> book.year > year).findFirst().get();
        return oldestBook;
    }
}
