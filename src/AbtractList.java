public interface AbtractList<E> extends Iterable<E> {
    boolean add( int element);
    boolean add(int index, int element);
    int get (int index);
    int set(int index, int element);
    int remove(int index);
    int size();
    int indexOf(int element);
    boolean contains(int element);
    boolean isEmpty();
}
