import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String textTask1 = scanner.nextLine();
        reverseText(textTask1);

        String textTask2 = "oiJFOIPAFIAJOPEJAsadjioasd 2024 oksamdaomqwidm 1234 aoskdmkmadsa 22";
        String s = replaceAllYears(textTask2, "YEAR");
        System.out.println(s);
        scanner.close();
    }

    public static void reverseText(String text) {
        System.out.println(new StringBuilder(text).reverse());
    }

    public static String replaceAllYears(String text, String replace) {
        /*
         * \\b - ищет пробел
         * \\d - ищет 4 цифры подрят
         * \\b - ищет пробел
         */
        String regex = "\\b\\d{4}\\b";
        String s = text.replaceAll(regex, replace);
        return s;
    }
}
