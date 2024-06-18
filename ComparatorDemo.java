import java.util.*;
class Student {
    int marks;
    int age;
    String name;

    public Student(int marks, int age, String name) {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Marks: " + marks + ", Age: " + age + ", Name: " + name;
    }
}

// Define the Alpha class that implements the Comparator interface
// class Alpha implements Comparator<Student> {
//     @Override
//     public int compare(Student s1, Student s2) {
//         if (s1.age > s2.age) {
//             return 1;
//         } else if (s1.age < s2.age) {
//             return -1;
//         } else {
//             return 0;
//         }
//     }
// }
// this is function interface we use lambda expression for this 

// Main class
public class ComparatorDemo {
    public static void main(String[] args) {
        Student s1 = new Student(100, 20, "Rahul");
        Student s2 = new Student(90, 21, "Mahesh");
        Student s3 = new Student(80, 22, "Khusi");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("Before sorting: " + list);

        // Alpha a = new Alpha();
        Comparator<Student> com = (Student a, Student b)->
        {
           if (a.age > b.age) {
             return 1;
           }
           else{
            return -1;
           }
        };
    
        Collections.sort(list, com);

        System.out.println("After sorting: " + list);
    
}
}
