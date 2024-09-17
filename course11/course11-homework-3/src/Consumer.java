public class Consumer extends Thread {
    private final SharedBuffer sharedBuffer;

    public Consumer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                sharedBuffer.remove();
                sleep(150);
            }
        } catch (InterruptedException e) {
            currentThread().interrupt();
        }
    }

}
