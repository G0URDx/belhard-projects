public class AppC {
    public static void main(String[] args) throws Exception {
        SetC<String> set = new SetC<>();

        // Add Elements
        for (int i = 0; i < 64; i++) {
            set.add("Element - " + i);
        }
        System.out.println(set);

        // Remove object
        set.remove("Element - 0");
        System.out.println(set);

        // Contains object
        System.out.println("Contains 8? = " + set.contains("Element - 8"));
        System.out.println("Contains 100? = " + set.contains("Element - 100"));

        // Set size
        System.out.println("Set size = " + set.size());

        // Set is empty
        // set.clear();
        System.out.println("Set is empty? = " + set.isEmpty());

        // Add new set
        SetC<String> newSet = new SetC<>();
        for (int i = 0; i < 8; i++) {
            newSet.add("New element - " + i);
        }
        set.addAll(newSet);
        System.out.println(set);

        // Contains set
        SetC<String> containsSet = new SetC<>();
        for (int i = 8; i < 17; i++) {
            containsSet.add("Element - " + i);
        }
        System.out.println("Contains from 8 to 16? = " + set.containsAll(containsSet));

        // Remove set
        SetC<String> removeSet = new SetC<>();
        for (int i = 8; i < 17; i++) {
            removeSet.add("Element - " + i);
        }
        set.removeAll(removeSet);
        System.out.println(set);
    }
}
