public interface MyList<T> {
    int size();
    boolean contains(Object O);
    void add(T item);
    void add(T item,int index);
    boolean remove( T item);
    void clear();
    T get(int index);
    int indexOf(Object O);
    int lastIndexOf(Object O);
    void sort();
}
