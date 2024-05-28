class Student
{
    private int age;
    private String name;
    Student()
    {
        this("ram",12);
        System.out.println("Default constructor is called");
        name = "narendra";
        age = 20;
    }
    Student(String name)
    {
        this();//same class constructor called 
        this.name = name;
        age = 20;
    }
    Student(String name , int age){
        this.name = name;
        this.age  = age;

    }
    public void display()
    {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Launch3 {
    public static void main(String[] args)
     {
    Student obj = new Student();
    obj.display();
    Student obj1 = new Student("khusi");
    obj1.display();
    Student obj2 = new Student("khusi",19);
    obj2.display();
    }
}
