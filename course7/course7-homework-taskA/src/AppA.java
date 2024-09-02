public class AppA {
    public static void main(String[] args) throws Exception {
        ListA<String> list = new ListA<>();

        // Add Elements
        for (int i = 0; i < 64; i++) {
            list.add("Element - " + i);
        }
        System.out.println("List size is {" + list.size() + "}");

        // Search by index (MIN = 0 & MAX = 63)
        System.out.println("\nSearch by index:");
        System.out.println(list.get(63));

        // Remove by index
        list.remove(5);
        System.out.println(list);
    }
}