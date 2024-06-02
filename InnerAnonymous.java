interface Car
{
    void drive();
}
// class WagonR implements car{
//     void drive(){
//         System.out.println("Driving...");
//     }
// }


public class InnerAnonymous {
    public static void main(String[] args) {
        Car obj = new Car(){
            public void drive(){
                System.out.println("Driving....");
            }
        };
        obj.drive();
        // WagonR c= new WagonR();
        // c.drive();
    }
}
