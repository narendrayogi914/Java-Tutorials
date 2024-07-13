package Start;
import java.util.*;

public class ReadKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String x = sc.next(); // we can use nextline( ) too, but it will take the whole line as a string including spaces
        System.out.println("Welcome Mr/Miss " + x);
    }
}