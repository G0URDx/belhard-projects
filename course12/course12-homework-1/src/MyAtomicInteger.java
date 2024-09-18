public class MyAtomicInteger {
    private int value;

    public MyAtomicInteger(int value) {
        this.value = value;
    }

    public synchronized int incrementAndGet() {
        int oldValue;
        do {
            oldValue = value;
        } while (!compareAndSet(oldValue, oldValue + 1));
        return oldValue + 1;
    }

    private synchronized boolean compareAndSet(int expectedValue, int newValue) {
        if (value == expectedValue) {
            value = newValue;
            return true;
        }
        return false;
    }

    public int getValue() {
        return value;
    }

}
