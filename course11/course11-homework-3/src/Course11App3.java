public class Course11App3 {
    public static void main(String[] args) throws Exception {
        SharedBuffer sharedBuffer = new SharedBuffer(8);

        Producer producer = new Producer(sharedBuffer);
        Consumer consumer = new Consumer(sharedBuffer);

        producer.start();
        consumer.start();
    }
}
