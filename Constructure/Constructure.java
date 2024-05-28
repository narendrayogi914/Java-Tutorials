package Constructure;
class Student
{
    private int age;
    private String name;
    Student(int age , String name)
    {
        this.age = age;
        this.name = name;

    }
    // public void setAge(int age)
    // {
    //     this.age = age;
    // }
    // public int getAge()
    // {
    //     return age;
    // }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName(){
        return name;

    }

}

public class Constructure {
    public static void main(String[] args) {
        Student s1 = new Student(10 ,"Rahul");
        // s1.setAge(18);
        // s1.setName("John");
        int std1age =s1.getAge(); 
        String std1name =s1.getName(); 
        System.out.println(std1age + " "+ std1name);
    }
    
}
