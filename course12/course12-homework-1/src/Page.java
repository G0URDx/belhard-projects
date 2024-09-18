import java.util.concurrent.atomic.AtomicInteger;

public class Page {
    private String name;
    private AtomicInteger views;

    public Page(String name, AtomicInteger views) {
        this.name = name;
        this.views = views;
    }

    public AtomicInteger getViews() {
        return views;
    }

    public void setViews(AtomicInteger views) {
        this.views = views;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
