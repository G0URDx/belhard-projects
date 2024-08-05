import java.util.Scanner;

public class JavaTask2 {
    public static void main(String[] args) throws Exception {
        step1(); // Step 1 Method
        Scanner scannerTask2 = new Scanner(System.in); // Init Scanner
        int month = 0;
        System.out.print("\nEnter month number: ");
        month = scannerTask2.nextInt(); // Input month using scanner
        step2(month); // Step 2 Method
        double a = 0;
        double b = 0;
        double c = 0;
        System.out.print("\nEnter a: ");
        a = scannerTask2.nextInt(); // Input a using scanner
        System.out.print("Enter b: ");
        b = scannerTask2.nextInt(); // Input b using scanner
        System.out.print("Enter c: ");
        c = scannerTask2.nextInt(); // Input c using scanner
        step3(a, b, c); // Step 3 Method
        System.out.println("\nJavaTask2 complete! Press <Enter> to continue");
        System.console().readLine();
    }

    static void step1() {
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

    static void step2(int month) {
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

    static void step3(double a, double b, double c) {
        double d = Math.pow(b, 2) + 4 * (a * c); // Finding discriminant
        double x1 = (0 - b) + Math.sqrt(d) / 2 * a; // Finding x1
        double x2 = (0 - b) - Math.sqrt(d) / 2 * a; // Finding x2
        System.out.println("D = " + d + "\nX1 = " + x1 + "\nX2 = " + x2);
    }
}
