import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMultiple {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);//creating resources
        try{
            num = sc.nextInt();

        }
        catch(InputMismatchException e){
            System.out.println("Enter a number");
            

        }
        finally{
            sc.close();
            System.out.println("Resorces Close");
            
        }
        System.out.println(num);

    }
}
