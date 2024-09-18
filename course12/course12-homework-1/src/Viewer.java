import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class Viewer extends Thread {

    private LinkedList<Page> book;

    public Viewer(LinkedList<Page> book) {
        this.book = book;
    }

    @Override
    public void run() {
        for (Page page : book) {
            AtomicInteger counter = new AtomicInteger(page.getViews().get());
            counter.getAndIncrement();
            page.setViews(counter);

            System.out.println(getName() + " viewed - " + page.getName() + ". Views = " + page.getViews());
        }
    }

}
