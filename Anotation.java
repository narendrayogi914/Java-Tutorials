@Deprecated
class Plane
{
    public void planeFilesAtGoodHeight()
    {
        System.out.println("Plan is Flying");
    }
}
@FunctionalInterface
interface Demo{
    void dis();
    

}
//this is child class of subclass
class CargoPlane extends Plane
{
    //overridden ,method form parent class
    @Override
    public void planeFilesAtGoodHeight(){
        System.out.println("Cargo Plane is Flying");
    }
}

public class Anotation {
    //object of chlid class
    public static void main(String[] args) {
        Plane cr = new CargoPlane();
        cr.planeFilesAtGoodHeight();
        
    }
}
