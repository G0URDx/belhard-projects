import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean active = true; // Activate App
        while (active) {
            Scanner scanner = new Scanner(System.in); // Init scanner
            System.out.println("1. JavaTask1\n2. JavaTask2\n3. JavaTask3\n4. Exit\nInput: ");
            int inputMenu = 0;
            try {
                inputMenu = scanner.nextInt();
                if (inputMenu < 1 || inputMenu > 4) {
                    System.out.println("\nInput must be number from 1 to 4");
                    inputMenu = 0;
                }
            } catch (Exception err) {
                System.out.println("\nError! Only numbers input\n");
                inputMenu = 0;
            }
            switch (inputMenu) {
                case 1:
                    boolean activeJavaTask1 = true; // Activate JavaTask1
                    while (activeJavaTask1) {
                        Scanner scannerTask1 = new Scanner(System.in); // Init array length scanner
                        int n = 0; // Init variable of array length
                        System.out.print("Input quantity of values in array: ");
                        try {
                            n = scannerTask1.nextInt(); // Input array length
                            if (n < 2) {
                                System.out.println("\nError! Array must be more than 1");
                                n = 0;
                            } else {
                                boolean arrayInput = true; // Activate array input
                                while (arrayInput) {
                                    Scanner arrayScanner = new Scanner(System.in); // Init input array elements scanner
                                    int[] array = new int[n]; // Init array
                                    System.out.println("Input " + n + " elements of array");
                                    try {
                                        for (int i = 0; i < n; i++) { // Input values in array using scanner
                                            array[i] = arrayScanner.nextInt();
                                        }
                                        System.out.println("Your array: ");
                                        for (int i = 0; i < array.length; i++) {
                                            System.out.print(array[i] + " ");
                                        }
                                        task1step1(array); // Step 1 method
                                        task1step2(array); // Step 2 method
                                        task1step3(array); // Step 3 method
                                        arrayInput = false; // Deactivate array input
                                        activeJavaTask1 = false; // Deactivate JavaTask1
                                        System.out.println("\nJavaTask1 complete! Press <Enter> to continue");
                                        System.console().readLine();
                                    } catch (Exception err) {
                                        System.out.println("\nError! Only numbers input");
                                        break;
                                    }
                                }
                            }
                        } catch (Exception err) {
                            System.out.println("\nError! Only numbers input");
                            n = 0;
                        }
                    }
                    break;
                case 2:
                    boolean activeJavaTask2 = true; // Activate JavaTask2
                    while (activeJavaTask2) {
                        task2step1(); // Step 1 Method
                        Scanner scannerTask2 = new Scanner(System.in); // Init Scanner
                        int month = 0;
                        System.out.print("\nEnter month number: ");
                        try {
                            month = scannerTask2.nextInt(); // Input month using scanner
                            task2step2(month); // Step 2 Method
                        } catch (Exception err) {
                            System.out.println("\nError! Only numbers input");
                            month = 0;
                        }
                        double a = 0;
                        double b = 0;
                        double c = 0;
                        try {
                            System.out.print("\nEnter a: ");
                            a = scannerTask2.nextInt(); // Input a using scanner
                            System.out.print("\nEnter b: ");
                            b = scannerTask2.nextInt(); // Input b using scanner
                            System.out.print("\nEnter c: ");
                            c = scannerTask2.nextInt(); // Input c using scanner
                            task2step3(a, b, c); // Step 3 Method
                        } catch (Exception err) {
                            System.out.println("\nError! Only numbers input");
                        }
                        activeJavaTask2 = false; // Deactivate JavaTask2
                        System.out.println("\nJavaTask2 complete! Press <Enter> to continue");
                        System.console().readLine();
                    }
                    break;
                case 3:
                    Scanner scannerTask3 = new Scanner(System.in); // Init scanner
                    int n = 0;
                    System.out.print("\nEnter array size: "); // Input array size
                    try {
                        n = scannerTask3.nextInt();
                    } catch (Exception err) {
                        System.out.println("\nError! Only numbers input");
                        n = 0;
                    }
                    int[][] array = task3step1(n); // Step 1 Method
                    System.out.println("\nYour array is:");
                    for (int i = 0; i < n; i++) { // Array output
                        for (int j = 0; j < n; j++) {
                            System.out.print(array[i][j] + " ");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("Total sum = " + task3step2(array)); // Step 2 Method
                    break;
                case 4:
                    active = false; // Deactivate app
                    break;
            }
        }

    }

    // #region Task1 Methods
    static void task1step1(int[] array) {
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

    static void task1step2(int[] array) {
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

    static void task1step3(int[] array) {
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

    // #endregion
    // #region Task2 Methods
    static void task2step1() {
        int n = 5; // Init array length
        int counter = 1; // Init counter for values
        int[][] array = new int[n][n]; // Init array
        System.out.println("Your array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = counter;
                System.out.print(array[i][j] + " ");
                counter++;
            }
            System.out.print("\n");
        }
    }

    static void task2step2(int month) {
        switch (month) { // Init "case" selection
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Нет такого месяца");
                break;
        }
    }

    static void task2step3(double a, double b, double c) {
        double d = Math.pow(b, 2) + 4 * (a * c); // Finding discriminant
        double x1 = (0 - b) + Math.sqrt(d) / 2 * a; // Finding x1
        double x2 = (0 - b) - Math.sqrt(d) / 2 * a; // Finding x2
        System.out.println("D = " + d + "\nX1 = " + x1 + "\nX2 = " + x2);
    }

    // #endregion
    // #region Task3 Methods
    static int[][] task3step1(int n) {
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

    static int task3step2(int[][] array) {
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

    static int[][] task3step3(int[][] array) {
        int max = 0;
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    indexMax = j;
                }
            }

        }
        return array;
    }
    // #endregion
}
