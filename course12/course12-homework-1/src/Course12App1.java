import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class Course12App1 {
    public static void main(String[] args) throws Exception {
        Page page1 = new Page("First page", new AtomicInteger(0));
        Page page2 = new Page("Second page", new AtomicInteger(0));
        Page page3 = new Page("Third page", new AtomicInteger(0));

        LinkedList<Page> book = new LinkedList<>();
        book.add(page1);
        book.add(page2);
        book.add(page3);

        for (int i = 0; i < 10; i++) {
            Viewer viewer = new Viewer(book);
            viewer.start();
            try {
                viewer.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
