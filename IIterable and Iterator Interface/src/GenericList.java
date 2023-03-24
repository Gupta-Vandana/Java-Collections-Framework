import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
    private T[] items;
    private int size;

    public GenericList() {
        size = 0;
        items = (T[]) new Object[100];
    }
    public void add(T item) {
        items[size++] = item;
    }
    public T getItemAtIndex(int idx) {
        return items[idx];
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }
    private class GenericListIterator implements Iterator{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}
