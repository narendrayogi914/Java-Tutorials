public class ExceptionHSecond {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = 0;
        try 
        {
             result = num1/num2;
             System.out.println("In try block");


        }
        catch(Exception e)
        {
            System.out.println("Something went Wrong" + e);

        }
        System.out.println(result);
        System.out.println("Bye");


    }
    
}   
