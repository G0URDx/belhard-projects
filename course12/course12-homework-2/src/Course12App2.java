import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Course12App2 {
    public static void main(String[] args) throws Exception {
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        int threadsNumber = 5;
        int searchPartsSize = array.length / threadsNumber;

        ExecutorService executorService = Executors.newFixedThreadPool(threadsNumber);
        Future<Integer>[] results = new Future[threadsNumber];

        for (int i = 0; i < threadsNumber; i++) {
            int start = i * searchPartsSize; // 0*2=0; 1*2=2; 2*2=4; ...
            int end = (i == threadsNumber - 1) ? array.length : start + searchPartsSize; // 0+2=2; 2+2=4; 4+2=6; ...
            results[i] = executorService.submit(new FindMax(array, start, end));
        }

        int max = 0;
        try {
            for (Future<Integer> result : results) {
                int findedMax = result.get();
                if (findedMax > max) {
                    max = findedMax;
                }
            }
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ". " + array[i]);
        }
        System.out.println(max);

        executorService.shutdown();
    }
}
