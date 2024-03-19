import javax.swing.text.Element;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist<E> implements AbtractList<E> {
    //khai bao index
    private  int index=0;
    //khai bao 1 hang so
    private final int DEFAULT_CAPACITY =5;

    //mang nay co kieu du lieu la e //ecapsulation
    private E[] elements;

    //construtor
    public Arraylist(){
     elements=(E[]) new Object[DEFAULT_CAPACITY]; //ep kieu E vaf hien ti chua dc 5 phan tu
    }


    //sau khi khai bao index dong thoi no se tang len 1 gia tri
    @Override
    public boolean add(E element) {
        elements[index] = element;  // chay theo thu tu thu 0 den cuoi mang
        index =index+1;
        return true; //run success ->true
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
class ArrayListTest{
    public static void main(String[] args)
    {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);
        myArrayList.add(60);
        myArrayList.add(70);


        System.out.println();
    }
}
