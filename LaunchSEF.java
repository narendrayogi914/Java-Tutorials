public class LaunchSEF {
    static int age;
    static
    {
        System.out.println("static block");
        age =17;

    }
    static void display(){
        System.out.println("Display static block");
        System.out.println(age);

    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        display();
    }
}
