package StackADT;

public interface AbstractStack<E> {
    void push(E element); //element dat len head();

    E pop(); //lay element ra khoi stack;

    E peek(); // check ;

    int Size();

    boolean isEmpty();
}
