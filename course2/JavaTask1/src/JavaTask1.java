import java.util.Scanner;

public class JavaTask1 {
    public static void main(String[] args) throws Exception {
        Scanner scannerTask1 = new Scanner(System.in); // Init array length scanner
        int n = 0; // Init variable of array length
        System.out.print("Input quantity of values in array: ");
        n = scannerTask1.nextInt(); // Input array length
        if (n < 2) {
            System.out.println("\nError! Array must be more than 1");
            n = 0;
        } else {
            Scanner arrayScanner = new Scanner(System.in); // Init input array elements scanner
            int[] array = new int[n]; // Init array
            System.out.println("Input " + n + " elements of array");
            for (int i = 0; i < n; i++) { // Input values in array using scanner
                array[i] = arrayScanner.nextInt();
            }
            System.out.println("Your array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            step1(array); // Step 1 method
            step2(array); // Step 2 method
            step3(array); // Step 3 method
            System.out.println("\nJavaTask1 complete! Press <Enter> to continue");
            System.console().readLine();
        }
        scannerTask1.close();
    }

    static void step1(int[] array) {
        int min = array[0]; // Init min value
        int max = array[0]; // Init max value
        for (int i = 0; i < array.length; i++) { // Search min and max value
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\nMin value: " + min);
        System.out.println("Max value: " + max);
    }

    static void step2(int[] array) {
        double avg = 0;
        for (int i = 0; i < array.length; i++) { // Sum all values
            avg += array[i];
        }
        System.out.print("Values lower than average value: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < avg / array.length) { // Serching values for that lower than average
                System.out.print(array[i] + " ");
            }
        }
    }

    static void step3(int[] array) {
        int min = array[0]; // Init min value
        for (int i = 0; i < array.length; i++) { // Search for min value
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.print("\nIndexes of min values: ");
        for (int i = 0; i < array.length; i++) { // Print indexes with min values
            if (array[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}
