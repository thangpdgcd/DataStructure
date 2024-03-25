package Day2DSA1649;

public class Box<E> { //chuyen doi E
    private E content;

    public void setContent(E content) {
        this.content = content;
    }

    public E getContent() {
        return this.content;
    }

}

class BoxRuner {
    public static void main(String args[]) {
        // use interger
        Box<Integer> myBox = new Box<>();
        myBox.setContent(2024);

        int result = myBox.getContent();
        //use String
        System.out.println("My result" + result);

        Box<String> myBoxStr = new Box<>();
        myBoxStr.setContent("John");

        //use double
        Box<Double> myBoxDbl = new Box<>();
        myBoxStr.setContent("John");


    }

}

