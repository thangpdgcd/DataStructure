import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListEnhanced<E> implements AbtractList {
    private int[] elements = new int[5]; //tạo một mảng với kích thước = 5

    private int index = 0;

    @Override
    public boolean add(int element) {
        if (this.index == elements.length) {
            elements = Arrays.copyOf(this.elements, this.elements.length * 2);
        }
        //tạo 1 array mới gấp đôi array cũ, copy lại những số đầu = copyof
        this.elements[this.index] = element; //nhập 1 số vào với index = 0
        this.index = this.index + 1;// nhập tiếp theo vào số index phía sau, để khỏi phải nhập trùng ô
        return true;
    }

    @Override
    public boolean add(int index, int element) { // chèn dữ liệu vào ô tiếp theo
        //move data to the right -> loop
//        for(int i = this.index; i > index ; i-- ){
//            elements[i] = elements[i - 1]; // index của hiện tại -1, lấy i-1 bỏ vào i
//        }
        if (this.index == elements.length) {
//            //option1
//            System.out.println("Array is full now");
//            return false;
            //option2
            this.elements = Arrays.copyOf(this.elements, this.elements.length * 2);
        }
        //insert new data
        elements[index] = element;
        this.index = this.index + 1;
        return true;
    }

    @Override
    public int get(int index) {
        //
        if (index >= 0 && index < this.index) {
            throw new IllegalStateException("Out of the list");
        }

        return this.elements[index];//xem trong index là giá trị gì ở trong
    }

    @Override
    public int set(int index, int element) {
        int temp = this.elements[index]; //tạo temp là một biến tạm, trả số cũ ra
        this.elements[index] = element;// đưa một số mới vào
        return temp;// thay thành một số mới
    }

    @Override
    public int remove(int index) {
        int temp = this.elements[index];// tạo temp là một biến tạm
        for (int i = index; i < this.index; i++) {
            //lấy giá trị của vòng lặp để chạy, nó sẽ chạy đếm khi nào = this.index
            elements[i] = elements[i + 1];
        }
        elements[this.index - 1] = 0;// đưa index trước đó = 0
        this.index = this.index - 1;// this.index--;(giảm index xún)
        //decrease array size
        if (this.index <= elements.length / 3) {
            this.elements = Arrays.copyOf(this.elements, this.elements.length / 2);
        }
        return temp;

    }

    @Override
    public int size() {
        return this.index;// kiem tra co bao nhieu index trong array
    }

    @Override
    public int indexOf(int element) {
        int result = -1;
        for (int i = 0; i < this.index; i++) {
            if (elements[i] == element) {
                result = i;
                break;
            }
        }
        return result;
    }

    @Override
    public boolean contains(int element) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}

class ArrayListEnhancedRunner {
    public static void main(String[] args) {
        ArrayListEnhanced myArr = new ArrayListEnhanced();

        System.out.println(myArr.size());
        myArr.add(10);
        myArr.add(20);
        myArr.add(30);
        myArr.add(40);
//        myArr.add(50);
        System.out.println(myArr.get(1));//20
        System.out.println(myArr.get(7));//error


//        System.out.println(myArr.add(60));
//        System.out.println(myArr.add(60));
//        System.out.println(myArr.add(60));
//        System.out.println(myArr.add(60));
//        System.out.println(myArr.add(60));
//        System.out.println(myArr.add(60));
//        System.out.println(myArr.add(60));
//        System.out.println(myArr.add(60));
//        System.out.println(myArr.add(60));
//        System.out.println(myArr.add(60));
//        System.out.println(myArr.add(60));
//        System.out.println(myArr.add(60));
//        System.out.println(myArr.add(60));
//        System.out.println(myArr.add(60));
//
//
//        System.out.println(myArr.remove(1));
//        System.out.println(myArr.remove(1));
//        System.out.println(myArr.remove(1));
//        System.out.println(myArr.remove(1));
//        System.out.println(myArr.remove(1));
//        System.out.println(myArr.remove(1));
//        System.out.println(myArr.remove(1));
//        System.out.println(myArr.remove(1));
//        System.out.println(myArr.remove(1));


    }

}