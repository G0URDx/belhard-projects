public interface List<T> {

    void add(T element);

    void add(int index, T element);

    void addAll(List<?> c);

    void remove(int index);

    T get(int index);

    T set(int index, T element);

    String toString();

    int printSize();
}
