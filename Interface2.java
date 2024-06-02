interface   Computer {
      void compileCode();
}
class Laptop implements Computer{
    public void compileCode() {
        System.out.println("You got 5 errors");

    }

}
class Desktop implements Computer{
    public void compileCode() {
        System.out.println("You got 10 errors");
    }
}
class Developer{
    public void buildApp(Computer obj){
        System.out.println("Building Apps");
        obj.compileCode();

    }
}
public class Interface2{
    public static void main(String[] args) {
        Computer obj = new Desktop();
        Computer obj1 = new Laptop();
        Developer dev = new Developer();
        dev.buildApp(obj);
        dev.buildApp(obj1);
    
    }
}