class Animal{ // extensd Object 
    void sleep(){
        System.out.println("Anumal Need to sleep");

    }

}
class Tiger extends Animal{
    
}
public class TypeOfInheritance {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep(); 


    }
}
