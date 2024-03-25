import javax.swing.text.Element;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Arraylist<E> implements AbtractList<E> {
    //khai bao index
    private int [] element =new int[5];
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

        if(this.index == elements.length)
        {

            //option 1:
            //System.out.println("Array is full now");
            //return false;
            //option 2:
           this.elements= Arrays.copyOf(this.elements,this.elements.length * 2);
           //copy tu element cu cho array element moi
        }
        elements[index] = element;  // chay theo thu tu thu 0 den cuoi mang
        this.index =this.index + 1;
        return true; //run success ->true
    }

    @Override
    public boolean add(int index) {

        return false;
    }

    @Override
    public E remove(int index) {
//        int temp;
//        temp = this.elements[ index];
//        for(int i=index; i<this.index;i++)
//        {
//            elements[i]=elements[i+1];
//        }
//        elements[this.index-1]=0;
//        this.index=this.index-1;
//        return  temp;
        if(this.index == elements.length /3)
        {
            this.elements= Arrays.copyOf(this.elements,this.elements.length / 2);
        }
        return null;
    }

    @Override
    public int size() {
        return 0;
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
