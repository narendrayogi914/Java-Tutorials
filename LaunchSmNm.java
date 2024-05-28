class Demo{
    static void display(){
        System.out.println("This is a static method and display 1");
    }
    void display2(){
        System.out.println("this is a non static method and display2");
    }
}
public class LaunchSmNm {
    public static void main(String[] args) {
        Demo.display();
        Demo d = new Demo();
        d.display2();
    }
}
