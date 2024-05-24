class Student{
    int age;
    String name;
    public void setData(int age){
        this.age = age;
    }
    public void setData1(String name){
       this.name = name;
    }
    public void showData(){

    
        System.out.println("Age is "+age);
        System.out.println("Name is "+name);
    }
}
public class Encap {
    public static void main(String[] args) {
    Student obj = new Student();
    obj.setData(18);
    obj.setData1("Narendra");
    obj.showData();
    }
}
