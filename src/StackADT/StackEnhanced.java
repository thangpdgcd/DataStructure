//package StackADT;
//
//public class StackEnhanced<E> implements AbstractStack<E> {
//    ///khai bao
//    private StackEnhanced.Node<E> top; //bien toan cuc
//
//    private int size = 0; //theo doi so luong node ben trong
//
//
//    public StackEnhanced() {
//        top = null; //gan cho top la rong //ham nay chay dau tien
//
//    }
//
//    @Override
//    public void push(E element) { //day du lieu vao
//        StackEnhanced.Node<E> newNode = new StackEnhanced<>().Node<>(element); //khoi tao
//        newNode.next = top; //ban dau rong
//        top = newNode; //top tro vao node 0 (them moi)
//        size++;
//    }
//
//    @Override
//    public E pop() { //lay du lieu ra
//
//        //option 1:
////        Node<E> current = top; //khai bao bien moi gan cho top
////        top = top.next;
////        current.next = null;
//        //   size--;
////        return current.element; //tra ve element cho current
//
//        //option 2:
//        StackEnhanced.Node<E> next = top.next;
//        E temp = top.element;
//        top.next = null;
//        top = next;
//        size--;
//        return temp;
//
//
//    }
//
//    @Override
//    public E peek() { ///
//
//        return top.element;
//    }
//
//    @Override
//    public int Size() {
//        return this.size;
//    }
//
//    @Override
//    public boolean isEmpty() { // kiem tra stack co bi trong hay khong
//        if (size == 0 && top == null) {
//            return true;
//        }
//        return false;
//    }
//
//    //contructor
//
//    //viet theo kieu generic <E>
//
//    //khoi tao class nay de chua cac element
//    private class Node<E> {
//        private E element;
//
//        private Stack.Node<E> next;  //khai bao node de chua cai node tiep theo
//
//        //contructor
//        public Node(E element) {
//            this.element = element;
//            this.next = null; // node tiep theo = rong
//        }
//    }
//}
//
//class Runner {
//    public static void main(String args[]) {
//        Stack<Integer> myStack = new Stack<>();
//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(30);
//        myStack.push(40);
//        myStack.push(50);
//
//        int result = myStack.pop();
//        myStack.pop();//40
//        myStack.pop();//30
//        myStack.pop();//20
//        myStack.pop();//10
//        myStack.pop();//0
//
//
//        System.out.println(result);
//
////        System.out.println(myStack.size());
//        System.out.println(myStack.isEmpty());
//    }
//
//
//}
//package StackADT;
//
//public class StackEnhanced<E> implements AbstractStack<E> {
//    ///khai bao
//    private StackEnhanced.Node<E> top; //bien toan cuc
//
//    private int size = 0; //theo doi so luong node ben trong
//
//
//    public StackEnhanced() {
//        top = null; //gan cho top la rong //ham nay chay dau tien
//
//    }
//
//    @Override
//    public void push(E element) { //day du lieu vao
//        StackEnhanced.Node<E> newNode = new StackEnhanced<>().Node<>(element); //khoi tao
//        newNode.next = top; //ban dau rong
//        top = newNode; //top tro vao node 0 (them moi)
//        size++;
//    }
//
//    @Override
//    public E pop() { //lay du lieu ra
//
//        //option 1:
////        Node<E> current = top; //khai bao bien moi gan cho top
////        top = top.next;
////        current.next = null;
//        //   size--;
////        return current.element; //tra ve element cho current
//
//        //option 2:
//        StackEnhanced.Node<E> next = top.next;
//        E temp = top.element;
//        top.next = null;
//        top = next;
//        size--;
//        return temp;
//
//
//    }
//
//    @Override
//    public E peek() { ///
//
//        return top.element;
//    }
//
//    @Override
//    public int Size() {
//        return this.size;
//    }
//
//    @Override
//    public boolean isEmpty() { // kiem tra stack co bi trong hay khong
//        if (size == 0 && top == null) {
//            return true;
//        }
//        return false;
//    }
//
//    //contructor
//
//    //viet theo kieu generic <E>
//
//    //khoi tao class nay de chua cac element
//    private class Node<E> {
//        private E element;
//
//        private Stack.Node<E> next;  //khai bao node de chua cai node tiep theo
//
//        //contructor
//        public Node(E element) {
//            this.element = element;
//            this.next = null; // node tiep theo = rong
//        }
//    }
//}
//
//class Runner {
//    public static void main(String args[]) {
//        Stack<Integer> myStack = new Stack<>();
//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(30);
//        myStack.push(40);
//        myStack.push(50);
//
//        int result = myStack.pop();
//        myStack.pop();//40
//        myStack.pop();//30
//        myStack.pop();//20
//        myStack.pop();//10
//        myStack.pop();//0
//
//
//        System.out.println(result);
//
////        System.out.println(myStack.size());
//        System.out.println(myStack.isEmpty());
//    }
//
//
//}
