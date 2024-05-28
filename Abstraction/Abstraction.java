package Abstraction;
abstract class Aeroplane{
    abstract public void takeoff();
    // {
    //     System.out.println("Aeroplane is taking off");
    // }
   abstract public void fly();
    // {
    //     System.out.println("Aeroplane is flying");
    // }
}
class CargoPlane extends Aeroplane{
    public void takeoff(){
        System.out.println("Cargo Plane require Longer Runway ");
    }
    public void fly(){
        System.out.println("Cargo Plane is flying at lower height");
    }
}
class PassengerPlance extends Aeroplane{
    public void takeoff(){
        System.out.println("PassengerPlane  require Medium Runway ");
    }
    public void fly(){
        System.out.println("Cargo Plane is flying at High height");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Aeroplane a =  new CargoPlane();
        a.takeoff();
        a.fly();
    }
}
