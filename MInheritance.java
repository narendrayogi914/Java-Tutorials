class AeroPlane
{
    public void takeoff(){
        System.out.println("Aeroplane is taking off");

    }
    public void fly(){
        System.out.println("Aeroplane is flying");// this is called overridden  

    }
}
class CargoPlane extends AeroPlane{
    public void fly(){
        System.out.println("CargoPlane flies at lower Height "); //this is called override 
    }
    public void carryGoods(){
        System.out.println("CargoPlane carries goods");
    }
}
class PassengerPlane extends AeroPlane{
    public void fly(){
        System.out.println("PassengerPlane Flies at medium hight");// override method 
    }
    public void carryPassenger(){
        System.out.println("Passenger Plane Carries Passenger");
        
    }
   
}

public class MInheritance {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeoff();
        cp.fly();


        PassengerPlane pp = new PassengerPlane();
        pp.takeoff();
        pp.fly();
        
    }
}
