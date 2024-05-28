
class Demo{
    private int a ;
    private int b;
    public Demo()//this is default constructure this is initialized automatic behind the scene and this is zero permarameterized
    {
       System.out.println("Zero parameterized constructure by programmer ");                         
    }
    public Demo(int a , int b){
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
    }
}
public class Constructure2 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
        Demo d1 = new Demo(1,2);
        d1.display();
    }
}
