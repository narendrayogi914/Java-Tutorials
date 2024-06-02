@FunctionalInterface

interface Car
{
    void drive();
    //void drive(int age);
}
public class LambdaExpression {
    public static void main(String[] args) {
        Car obj = () -> System.out.println("Driving..");
        //Car obj = age -> sop("Driving ...." + age);
        //Car obj = (age , ts)->....
        obj.drive();
    }
    
}
