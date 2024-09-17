public class CounterThread extends Thread {
    private final static Object lock = new Object(); // sync object
    static boolean isThread1Turn = true;
    private int threadId;

    public CounterThread(int threadId) {
        this.threadId = threadId;
    }

    @Override
    public void run() {
        for (int i = threadId; i <= 100; i += 2) {
            synchronized (lock) {
                while ((threadId == 1 && !isThread1Turn) || (threadId == 2 && isThread1Turn)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        interrupt();
                    }
                }
                System.out.println("Thread " + threadId + " counted " + i);
                isThread1Turn = !isThread1Turn;
                lock.notify();
            }
        }
    }

}
