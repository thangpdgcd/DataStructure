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
            student1.name = "I am a Programming";
            System.out.println( student1.name);

            //extend in Class Student-2
            Student student2 =new Student();
            student2.age = "21";
            System.out.println( student2.age);

            //extend in Class Student-3
            Student student3 =new Student();
            student3.Address = "Da Nang";
            System.out.println(student3.Address);

            //Create Object in Student
            Student[] myClass ={student1,student2,student3};

            //get first element in array myClass
            System.out.println("Element first in Array " + myClass[0].name);
        }

    }
}
class Student{
    public String name;
    public String age;
    public String Address;
}

