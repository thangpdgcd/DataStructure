public class Mainclassic {
    public static void main(String[] args) {
        {

            Student student1 = new Student();
            student1.name = "I am a Programming ";
            System.out.println(student1.name);

            //extend in Class Student-2
            Student student2 = new Student();
            student2.age = "21 ";
            System.out.println(student2.age);

            //extend in Class Student-3
            Student student3 = new Student();
            student3.Address = "Da Nang ";
            System.out.println(student3.Address);

            //extend in Class Student-3
            Student student4 = new Student();
            System.out.println(student4.name);

            //Create Object in Student
            Student[] myClass ={student1,student2,student3,student4};

            //get first element in array myClass
            System.out.println("Element first in Array " + myClass[0].name);

            // gan ten cho so 3 cua array
            myClass[3].name = "Thang";

            //remove element 2 set 2 = null
            myClass[2]=null;
        }
    }

}


