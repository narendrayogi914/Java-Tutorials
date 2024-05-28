class Animal
{
 public void eat()
 {
    System.out.println("Animal Eats Everyday");
 }
}
class Tiger extends Animal
{
    public void eat(){
        System.out.println("Tiger Hunts and  Eat");
    }
}

public class InheritanceMore {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
    }
}
