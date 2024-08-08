import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JavaTask3 {
    public static void main(String[] args) throws Exception {
        Scanner scannerTask3 = new Scanner(System.in); // Init scanner
        int n = 0;
        System.out.print("\nEnter array size: "); // Input array size
        n = scannerTask3.nextInt();
        int[][] array = step1(n); // Step 1 Method
        System.out.println("\nYour array is:");
        for (int i = 0; i < n; i++) { // Array output
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Total sum = " + step2(array)); // Step 2 Method
        step3(array);
        System.out.println("\nYour changed array is:");
        for (int i = 0; i < n; i++) { // Array output
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
        scannerTask3.close();
    }

    static int[][] step1(int n) {
        Random random = new Random(); // Init "Random" class variable
        boolean equalsN = false; // Init variable for positive numbers
        boolean equalsNegativeN = false; // Init variable for negative numbers

        int[][] array = new int[n][n]; // Init array
        while (!equalsN && !equalsNegativeN) { // Filling array with values
            equalsN = false;
            equalsNegativeN = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = random.nextInt(-n, n);
                    if (array[i][j] == n) {
                        equalsN = true;
                    }
                    if (array[i][j] == -n) {
                        equalsNegativeN = true;
                    }
                }
            }
        }
        return array;
    }

    static int step2(int[][] array) {
        int totalSum = 0; // Init total sum
        for (int i = 0; i < array.length; i++) {
            int pos1 = 0; // Init pos1 for first positive number
            int pos2 = 0; // Init pos2 for second positive number
            for (int j = 0; j < array.length; j++) { // Searching for indexes with positive numbers
                if (array[i][j] > 0) {
                    if (pos1 == 0) {
                        pos1 = j;
                        // System.out.println("i = " + i + " Pos1 = " + pos1);
                    } else if (pos2 == 0) {
                        pos2 = j;
                        // System.out.println("i = " + i + " Pos2 = " + pos2);
                        break;
                    }
                }
            }
            if (pos1 != pos2 - 1) { // Sum all values between positive numbers
                for (int j = pos1 + 1; j < pos2; j++) {
                    totalSum += array[i][j];
                }
            }
        }
        return totalSum;
    }

    static int[][] step3(int[][] array) {
        int max = 0; // Init max variable
        ArrayList<Integer> rowsToDelete = new ArrayList<>(); // Init dynamic array
        ArrayList<Integer> columsToDelete = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) { // Search for max element indexes
                    max = array[i][j];
                    rowsToDelete.clear();
                    columsToDelete.clear();
                    rowsToDelete.add(i);
                    columsToDelete.add(j);
                } else if (array[i][j] == max) {
                    rowsToDelete.add(i);
                    columsToDelete.add(j);
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (rowsToDelete.contains(i)) { // Change to 0
                    array[i][j] = 0;
                }
                if (columsToDelete.contains(j)) {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
}
