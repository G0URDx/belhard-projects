public class PingPongGame extends Thread {

    private boolean available = false;

    public synchronized void ping(int iterations) throws InterruptedException {
        while (available) {
            wait();
        }
        System.out.println("Ping");
        available = true;
        notify();
    }

    public synchronized void pong(int iterations) throws InterruptedException {
        while (!available) {
            wait();
        }
        System.out.println("Pong");
        available = false;
        notify();
    }

}
