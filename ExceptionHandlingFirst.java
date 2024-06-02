// syntax error 

// public class ExceptionHandlingFirst { //main class can not be a private class
//     public static void main(String[] args) {
//         system.out.printl();// syntax error 
        
//     }
// }

// logical error 
// public class ExceptionHandlingFirst{
//     public static void main(String[] args) {
//         int num1 = 6;
//         int num2 = 5;
//         int result = num1 - num2;
//         System.out.println("Addition is " + result);
//     }
// }
public class ExceptionHandlingFirst{
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = num1 /num2;
        System.out.println("Addition is " + result);
        System.out.println("Bye");
    }
}