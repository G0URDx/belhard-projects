import java.util.*;

public class Library {
    private ArrayList<Book> books;
    private HashMap<String, Book> bookMap;

    public Library() {
        books = new ArrayList<>();
        bookMap = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
        bookMap.put(book.getTitle(), book);
    }

    public void removeBook(String title) {
        if (title.length() == 0) {
            System.out.println("Enter book title!");
        }
        books.remove(bookMap.get(title));
        bookMap.remove(title);
    }

    public Book findBookByTitle(String title) {
        return bookMap.get(title);
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
