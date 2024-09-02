public class AppB {
    public static void main(String[] args) throws Exception {
        ListB<String> list = new ListB<>();

        // Add Elements
        for (int i = 0; i < 64; i++) {
            list.add("Element - " + i);
        }
        System.out.println("List size is {" + list.size() + "}");

        // Search by index (MIN = 0 & MAX = 63)
        System.out.println("\nSearch by index:");
        System.out.println(list.get(63));

        // Add by Index
        list.add(127, "Element - 127");
        System.out.println("\nList size is {" + list.size() + "}");

        // Remove by index
        list.remove(5);

        // Set by Index
        list.set(100, "Changed Element - 100");
        System.out.println(list);

        // Add whole list
        ListB<String> newList = new ListB<>();

        // Add Elements
        for (int i = 0; i < 8; i++) {
            newList.add("New element - " + i);
        }
        list.addAll(newList);
        System.out.println(list);
    }
}
