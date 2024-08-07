import java.util.Arrays;
import java.util.Random;

public class JavaTask4 {
    public static void main(String[] args) throws Exception {
        Random random = new Random(); // Init random
        int[] arrayVector = new int[5]; // Init vector
        int[][] arrayMatrix = new int[5][5]; // Init matrix
        for (int i = 0; i < arrayVector.length; i++) { // Input values in arrays
            arrayVector[i] = random.nextInt(0, 100); // Generating vector values
            for (int j = 0; j < arrayMatrix.length; j++) {
                arrayMatrix[i][j] = random.nextInt(0, 100); // Generating matrix values
            }
        }
        // step1 method
        System.out.println("Your vector is:" + "\n" + Arrays.toString(arrayVector));
        step1(arrayVector);
        System.out.println("\nYour sorted vector is:" + "\n" + Arrays.toString(arrayVector));
        // step2 method
        System.out.println("\nYour matrix is:");
        printMatrixInt(arrayMatrix);
        step2(arrayMatrix);
        System.out.println("\nYour sorted matrix is:");
        printMatrixInt(arrayMatrix);

        double[] mulVector = new double[5];
        double[][] mulMatrix1 = new double[5][5];
        double[][] mulMatrix2 = new double[5][5];
        for (int i = 0; i < arrayVector.length; i++) { // Input values in arrays
            mulVector[i] = random.nextInt(); // Generating vector values (double)
            for (int j = 0; j < arrayMatrix.length; j++) {
                mulMatrix1[i][j] = random.nextInt(); // Generating matrix values (double)
                mulMatrix2[i][j] = random.nextInt();
            }
        }

        System.out.println("\nMatrix * vector:" + "\n" + Arrays.toString(mul(mulMatrix1, mulVector))); // Matrix *
                                                                                                       // vector
        System.out.println("\nMatrix * matrix:");
        printMatrixDouble(mul(mulMatrix1, mulMatrix2)); // Matrix * matrix

        String text = "Laoreet vestibulum aliquet lobortis dictum leo feugiat Justo suspendisse natoque mollis";
        System.out.println("\nYour text is:" + "\n" + text);
        System.out.println("\nYour changed text is:" + "\n" + replace(text));

        String isPalindromWord = "kolok";
        System.out.println("\nYour word " + isPalindromWord + " is palindrom: " + isPalindrom("kolok")); // Define
                                                                                                         // palindrom
    }

    static void printMatrixInt(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static void printMatrixDouble(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // Bubble sort
    static int[] step1(int[] array) {
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

    // Insertion sort
    static int[][] step2(int[][] array) {
        int[] tempArray = new int[25];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                tempArray[k++] = array[i][j]; // Conver matrix to vector
            }
        }
        for (int left = 0; left < tempArray.length; left++) { // Sort elements in row
            int tempValue = tempArray[left]; // Value of element
            int i = left - 1; // Finding indexes before sorting element
            for (; i >= 0; i--) {
                if (tempValue < tempArray[i]) { // If find lower value, move bigger value further
                    tempArray[i + 1] = tempArray[i];
                } else {
                    break; // If find bigger element, stop
                }
            }
            tempArray[i + 1] = tempValue; // Insert found value
        }
        k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = tempArray[k++]; // Conver vector to matrix
            }
        }
        return array;
    }

    // result[i] = \sum(n,i=1) matrix[i][j] * vector[j]
    static double[] mul(double[][] matrix, double[] vector) {
        double[] result = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                result[i] = result[i] + matrix[i][j] * vector[j];
            }
        }
        return result;
    }

    // result[i][j] = \sum(n,k=1) matrix[i][k] * vector[k][j]
    static double[][] mul(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] = result[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Replace letters with #
    public static String replace(String text) {
        String[] words = text.split(" "); // Split text in array of words
        StringBuilder changedText = new StringBuilder(); // Init StringBuilder to add changes in text
        for (String word : words) {
            if (word.length() >= 4) {
                char[] letters = word.toCharArray(); // Transform string to char
                letters[3] = '#'; // Change letters
                if (word.length() >= 7) {
                    letters[6] = '#';
                }
                changedText.append(letters); // Transform char to string and insert in changed text
            } else {
                changedText.append(word); // Insert non-changed word
            }
            changedText.append(" ");
        }
        return changedText.toString();
    }

    // Find palindrom
    public static boolean isPalindrom(String word) {
        char[] letters = word.toCharArray(); // Transform string to char
        boolean status = false;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == letters[letters.length - 1 - i]) {
                status = true;
            } else {
                status = false;
            }
        }
        return status;
    }
}
