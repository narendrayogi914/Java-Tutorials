
class Human1
{
    private String name;
    int age;
    Human1(){
        System.out.println("Constructor Called");//constructor are also not inherit in child class

    }
    void sleep(){
        System.out.println("Human Needs Good Sleep");
    }
}
class Student1 extends Human1
{
    // public Student(){
    //     //super(); default constructor called and run the upper constructor using the super method  
    // }
    void display(){
        System.out.println("The Age is : " + age);
        // System.out.println("The Name is : "+name);// we cannot access the private member of the supar or parent class

    }
}

public class Inheritance {
    public static void main(String[] args) {
        Student1 st1  = new Student1();
        st1.sleep();
        st1.display();
    }
    
}
