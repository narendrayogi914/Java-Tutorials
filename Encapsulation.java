import java.util.Scanner;

class Student{
    private int id ;
    private String name;
    Scanner sc = new Scanner(System.in);
    public void get(){
        System.out.println("Enter the id ");
        id = sc.nextInt();
        System.out.println("Enter the name");
        name = sc.next();
    }
    public void show(){
        System.out.println("id:"+id+" name:"+name);

    }

}
public class Encapsulation{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.get();
        s1.show();
    }
}