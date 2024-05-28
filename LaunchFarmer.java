import java.util.Scanner;

class Farmer{
    int pa;
    float td;
    float si;
    static  float ri;
    static{
        ri = 4.5f;
    }

    void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount required: ");
        pa = scan.nextInt();
        System.out.println("Enter the time duration: ");
        td = scan.nextFloat();
        
    }
    void compute(){
        si = (pa*ri*td)/100;
    }
    void display(){
        System.out.println("Simple Interest Is : " + si);
    }
}

public class LaunchFarmer {
    public static void main(String[] args) {
    Farmer f1 = new Farmer();
    Farmer f2 = new Farmer();
    f1.input();
    f1.compute();
    f1.display();
    f2.input();
    f2.compute();
    f2.display();
    }
}
