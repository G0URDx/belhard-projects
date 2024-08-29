import java.util.Arrays;

public class ListB<T> implements List<T> {
    private static final Integer capacity = 16;
    private Object[] elements;
    private int size;

    // #region Constructors
    public ListB() {
        this.elements = new Object[capacity];
    }

    public ListB(int capacity) {
        this.elements = new Object[capacity];
    }
    // #endregion

    // #region Interface methods
    // Add element in array
    @Override
    public void add(T element) {
        checkArraySize();
        elements[size++] = element;
    }

    // Add element in array by Index
    @Override
    public void add(int index, T element) {
        if (size - 1 < index) {
            for (int i = size; i <= index; i++) {
                checkArraySize();
                if (i == index) {
                    elements[size++] = element;
                    break;
                }
                elements[size++] = null;
            }
        } else if (size - 1 >= index && index >= 0) {
            int elementsMoved = size - index;
            if (elementsMoved > 0) {
                checkArraySize();
                size++;
                System.arraycopy(elements, index, elements, index + 1, elementsMoved);
                elements[index] = element;
            }
        }
    }

    @Override
    public void addAll(List<?> c) {
        int elementsAdded = c.printSize();
        Object[] newElements = new Object[elementsAdded];
        for (int i = 0; i < elementsAdded; i++) {
            newElements[i] = c.get(i);
        }
        checkArraySize(size + elementsAdded);
        System.arraycopy(newElements, 0, elements, size, elementsAdded);
        size += elementsAdded;
    }

    // Remove by Index
    @Override
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
    @Override
    @SuppressWarnings("unchecked")
    public T get(int index) {
        try {
            return (T) elements[index];
        } catch (Exception exception) {
            return null;
        }
    }

    // Set element by Index
    @Override
    @SuppressWarnings("unchecked")
    public T set(int index, T element) {
        try {
            elements[index] = element;
            return (T) elements[index];
        } catch (Exception exception) {
            return null;
        }
    }
    // #endregion

    // #region Other methods
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

    // Check array size for new elements (new elements > 1)
    private void checkArraySize(int minSize) {
        // If size equals array size - duplicate this array with double size
        if (minSize > elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }

    // Prints size of list
    @Override
    public int printSize() {
        return this.size;
    }
    // #endregion

}
