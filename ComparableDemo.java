import java.util.*;
class Student implements Comparable<Student> {
    int marks;
    int age;
    String name;

    public Student(int marks, int age, String name) {
        this.markms = marks;
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

    public int compareTo(Student a) {
        if (this.age == a.age) {
            return -1;

        } else
            return 0;
    }
}

// Main class
public class ComparableDemo {
    public static void main(String[] args) {
        Student s1 = new Student(100, 20, "Rahul");
        Student s2 = new Student(90, 21, "Mahesh");
        Student s3 = new Student(80, 22, "Khusi");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("Before sorting: " + list);

        Collections.sort(list);

        System.out.println("After sorting: " + list);

    }
}
