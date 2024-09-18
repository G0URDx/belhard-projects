import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Course11App4 {
    public static void main(String[] args) throws Exception {
        // Создаем большой массив данных
        int[] data = new int[1000000];
        for (int i = 0; i < data.length; i++) {
            data[i] = i; // Пример заполнения
        }

        int target = 987654; // Элемент, который мы ищем
        ForkJoinPool pool = new ForkJoinPool(); // Создание пула потоков

        // Запускаем параллельный поиск
        SearchTask task = new SearchTask(data, 0, data.length - 1, target);
        Integer result = pool.invoke(task); // Запускаем задачу и ждем результат

        if (result != null) {
            System.out.println("Элемент найден на индексе: " + result);
        } else {
            System.out.println("Элемент не найден.");
        }

        pool.close();
    }

    static class SearchTask extends RecursiveTask<Integer> {
        private static final int THRESHOLD = 10000; // Порог, когда задача не делится дальше
        private final int[] array;
        private final int start;
        private final int end;
        private final int target;

        public SearchTask(int[] array, int start, int end, int target) {
            this.array = array;
            this.start = start;
            this.end = end;
            this.target = target;
        }

        @Override
        protected Integer compute() {
            // Если диапазон мал, выполняем линейный поиск
            if ((end - start) <= THRESHOLD) {
                for (int i = start; i <= end; i++) {
                    if (array[i] == target) {
                        return i; // Возвращаем индекс найденного элемента
                    }
                }
                return null; // Если элемент не найден
            } else {
                // Иначе делим задачу на две подзадачи
                int middle = (start + end) / 2;
                SearchTask leftTask = new SearchTask(array, start, middle, target);
                SearchTask rightTask = new SearchTask(array, middle + 1, end, target);

                // Запускаем обе подзадачи параллельно
                leftTask.fork();
                Integer rightResult = rightTask.compute(); // Выполняем правую задачу синхронно
                Integer leftResult = leftTask.join(); // Ждем результат левой задачи

                // Возвращаем результат, если он найден в одной из подзадач
                if (leftResult != null) {
                    return leftResult;
                } else {
                    return rightResult;
                }
            }
        }
    }
}
