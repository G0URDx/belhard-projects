public class Producer extends Thread {
    private final SharedBuffer sharedBuffer;

    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        int value = 1;
        try {
            while (true) {
                sharedBuffer.add(++value);
                sleep(300);
            }
        } catch (InterruptedException e) {
            currentThread().interrupt();
        }
    }

}
