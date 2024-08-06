import java.util.Arrays;
import java.util.Random;

public class JavaTask4 {
    public static void main(String[] args) throws Exception {
        Random random = new Random(); // Init random
        int[] arrayVector = new int[5]; // Init vector
        int[][] arrayMatrix = new int[5][5]; // Init matrix
        for (int i = 0; i < arrayVector.length; i++) { // Input values in arrays
            arrayVector[i] = random.nextInt(0, 100);
            for (int j = 0; j < arrayMatrix.length; j++) {
                arrayMatrix[i][j] = random.nextInt(0, 100);
            }
        }
        // step1 method
        System.out.println("Your vector is:");
        System.out.println(Arrays.toString(arrayVector));
        bubbleSort(arrayVector);
        System.out.println("\nYour sorted vector is:");
        System.out.println(Arrays.toString(arrayVector));
        // step2 method
        System.out.println("\nYour matrix is:");
        printMatrix(arrayMatrix);
        insertionSort(arrayMatrix);
        System.out.println("\nYour sorted matrix is:");
        printMatrix(arrayMatrix);
    }

    static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }

    static int[][] insertionSort(int[][] array) {
        for (int i = 0; i < array.length; i++) { // Rows
            for (int left = 0; left < array[i].length; left++) { // Sort elements in row
                int temp = array[i][left]; // Value of element
                int j = left - 1; // Finding indexes before sorting element
                for (; j >= 0; j--) {
                    if (temp < array[i][j]) { // If find lower value, move bigger value further
                        array[i][j + 1] = array[i][j];
                    } else {
                        break; // If find bigger element, stop
                    }
                }
                array[i][j + 1] = temp; // Insert found value
            }
        }
        return array;
    }
}
