public class Course11App1 {
    public static void main(String[] args) throws Exception {
        Thread thread1 = new CounterThread(1);
        Thread thread2 = new CounterThread(2);

        thread1.start();
        thread2.start();
    }
}
