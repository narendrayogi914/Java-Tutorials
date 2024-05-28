package Inheritance;
class Human{
    int age;
    void sleep(){
        System.out.println("Human Needs Good Slip");
        System.out.println(age);

    }

}
class Student extends Human{

}

class Inheritance1 
{
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep();
    }

    
}
