import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
    private T[] items;
    private int size;

    public GenericList() {
        size = 0;
        items = (T[]) new Object[5];
    }

    public void add(T item) {
        items[size++] = item;
    }

    public T getItemAtIndex(int idx) {
        return items[idx];
    }


    @Override
    public Iterator<T> iterator() {
        return new GenericListIterator(this);
    }

    private class GenericListIterator implements Iterator<T> {

        private GenericList<T> genericList;
        private int index = 0;

        private GenericListIterator(GenericList<T> genericList) {
            this.genericList = genericList;
        }

        @Override
        public boolean hasNext() {
            System.out.println("HasNext called");
            return index < genericList.items.length;
        }

        @Override
        public T next() {
            System.out.println("Next called");
//            if (this.hasNext())
//                return genericList.items[index++];
//            else
               // return null;

            return genericList.items[index++];
        }
    }
}
