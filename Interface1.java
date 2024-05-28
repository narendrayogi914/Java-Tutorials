interface A{
    void show();

}
interface x{
    void abc();
}
class B implements A,b{
    public void show(){
        System.out.println("In Show");
    }
    public void abc(){
        System.out.println("In Obc");

    }
}

public class Interface1 {
    public static void main(String[] args) {
      B obj = new B(); // we can aslo refer with A A obj = new B();
      obj.show();  
      obj.abc(); 
    }
}
