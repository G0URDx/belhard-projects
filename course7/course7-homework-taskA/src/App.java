public class App {
    public static void main(String[] args) throws Exception {
        ListA<String> list = new ListA<>();

        // Add Elements
        for (int i = 0; i < 64; i++) {
            list.add("Element - " + i);
        }
        System.out.println("List size is {" + list.printSize() + "}");

        // Search by index (MIN = 0 & MAX = 63)
        System.out.println("\nSearch by index:");
        System.out.println(list.get(63));

        // Serch by value (MIN = "Element - 0" & MAX = "Element - 63")
        System.out.println("\nSearch by value:");
        System.out.println(list.get("Element - 63"));

        // Remove by index (MIN = 0 & MAX = 63)
        list.remove(5);

        System.out.println(list);
    }
}