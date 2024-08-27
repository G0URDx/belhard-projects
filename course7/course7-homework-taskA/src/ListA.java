import java.util.Arrays;

public class ListA<T> {
    private static final Integer capacity = 16;
    private Object[] elements;
    private int size;

    // Create array without size parameters
    public ListA() {
        elements = new Object[capacity];
        // size = 0;
    }

    // Create array with size parameters
    public ListA(int capacity) {
        elements = new Object[capacity];
        // size = 0;
    }

    // Add elements in array
    public void add(T element) {
        checkArraySize();
        elements[size++] = element;
    }

    // Remove by Index
    public void remove(int index) {
        try {
            int elementsMoved = size - index - 1;
            if (elementsMoved > 0) {
                /*
                 * Parameter 1: Copy elements from "elements" (src)
                 * Parameter 2: First element of copied array "Deleted element + 1" (srcPos)
                 * Parameter 3: Copy elements to "elements" (dest)
                 * Parameter 4: Position of copies array "Deleted element" (destPos)
                 * Parameter 5: Quantity of copied elements "elementsMoved" (length)
                 */
                System.arraycopy(elements, index + 1, elements, index, elementsMoved);
                elements[--size] = null; // Remove last unused element
            }
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Index out of bounds");
        }
    }

    // Get element by Index
    @SuppressWarnings("unchecked")
    public T get(int index) {
        try {
            return (T) elements[index];
        } catch (Exception exception) {
            return null;
        }
    }

    // Get element by Value
    @SuppressWarnings("unchecked")
    public T get(T value) {
        if (size > 0) {
            for (Object element : elements) {
                if (element.equals(value)) {
                    return (T) element;
                }
            }
        }
        return null;
    }

    // Print all elements in array
    @Override
    public String toString() {
        if (size == 0) {
            return "Array is empty";
        }
        StringBuilder stringBuilder = new StringBuilder("\n");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(elements[i] + "\n");
        }
        return stringBuilder.toString();
    }

    // Check array size for new elements
    private void checkArraySize() {
        // If size equals array size - duplicate this array with double size
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }

    // Prints size of list
    public int printSize() {
        return this.size;
    }

}
