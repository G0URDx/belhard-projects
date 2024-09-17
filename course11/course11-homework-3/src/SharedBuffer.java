import java.util.*;

public class SharedBuffer {
    private final LinkedList<Integer> list;
    private final Integer capacity;

    public SharedBuffer(Integer capacity) {
        this.list = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void add(int value) throws InterruptedException {
        while (list.size() == capacity) {
            wait();
        }
        list.add(value);
        System.out.println("Producer produced value - " + value);
        notify();
    }

    public synchronized void remove() throws InterruptedException {
        while (list.isEmpty()) {
            wait();
        }
        int value = list.remove();
        System.out.println("Consumer consumed value - " + value);
        notify();
    }

}
