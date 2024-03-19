public interface AbtractList<E> extends Iterable<E> {
    boolean add(E element);
    E remove(int index);
}
