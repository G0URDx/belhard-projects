import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListA<T> implements List<T> {
    private static final Integer capacity = 16;
    private Object[] elements;
    private int size;

    // #region Constructors
    public ListA() {
        this.elements = new Object[capacity];
    }

    public ListA(int capacity) {
        this.elements = new Object[capacity];
    }
    // #endregion

    // #region TaskA
    // Add element in array
    @Override
    public boolean add(T e) {
        checkArraySize();
        elements[size++] = e; // Add new element
        return true;
    }

    // Remove by Index
    @SuppressWarnings("unchecked")
    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Object removedElement = elements[index];
        int elementsMoved = size - index - 1;
        if (elementsMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, elementsMoved);
        }
        elements[--size] = null; // Remove last unused element
        return (T) removedElement;
    }

    // Get element by Index
    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        try {
            return (T) elements[index];
        } catch (Exception exception) {
            return null;
        }
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
    // #endregion

    // #region Auto-generated methods
    @Override
    public void add(int index, T element) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public T set(int index, T element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        return null;
    }
    // #endregion

}