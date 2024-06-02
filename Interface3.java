interface A{
    void show();
     default void config(){
        System.out.println("In Config");


    }
    static void abc(){
        System.out.println("In abc");

    }
}
class B implements A{
    public void show(){
        System.out.println("In Show");

    }
}

public class Interface3 {
    public static void main(String[] args) {
       A.abc();
       A.config();/// it give error  
       B obj = new B();
       obj.config();
       obj.show();
    }
}
