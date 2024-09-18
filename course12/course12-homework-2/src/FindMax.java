import java.util.concurrent.Callable;

public class FindMax implements Callable {
    private Integer[] array;
    private Integer start;
    private Integer end;

    public FindMax(Integer[] array, Integer start, Integer end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override

    public Object call() throws Exception {
        int max = 0;
        for (int i = start; i < end; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
