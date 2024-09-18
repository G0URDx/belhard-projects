public class Course12App3 {
    public static void main(String[] args) throws Exception {
        PingPongGame pingPongGame = new PingPongGame();
        int iterations = 5;

        Thread ping = new Thread(() -> {
            try {
                for (int i = 0; i < iterations; i++) {
                    pingPongGame.ping(iterations);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });
        Thread pong = new Thread(() -> {
            try {
                for (int i = 0; i < iterations; i++) {
                    pingPongGame.pong(iterations);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });

        ping.start();
        pong.start();
    }
}