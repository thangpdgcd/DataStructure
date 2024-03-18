import java.util.ArrayList;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {
        {
            //Get element in Array
            //example1:
            int []  myNumb={1,2,3,4,5,6,7,8};
            System.out.println("This is a element get in Mynumb" + myNumb[2]);

            //example2:
            double[] mynumb ={1.2,2.2,3.2};
            System.out.println("This is a element get in Mynumb(double)" + mynumb[1]);

            //example3:
            //extend in Class Student-1
            Student student1 = new Student();
            student1.name = "I am a Programming ";
            System.out.println( student1.name);

            //extend in Class Student-2
            Student student2 =new Student();
            student2.age = "21 ";
            System.out.println( student2.age);

            //extend in Class Student-3
            Student student3 =new Student();
            student3.Address = "Da Nang ";
            System.out.println(student3.Address);

            //extend in Class Student-3
            Student student4 =new Student();
            System.out.println(student4.name);

            //ArrayList
            ArrayList<Student>myClass =new ArrayList<>() ;
            myClass.add(student1);
            myClass.add(student2);
            myClass.add(student3);
            myClass.add(student4);

            //print a list
            System.out.println(myClass);

            //remove
            myClass.remove(2);
            System.out.println("Element remove" + myClass);

        }

    }
}
class Student{
    public String name;
    public String age;
    public String Address;
}

