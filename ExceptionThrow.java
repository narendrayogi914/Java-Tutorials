public class Exceptionthrow {
    public static void main(String[] args) {
            int num1 = 6;
            int num2 = -2;
        
            try{
                if (num2<0) {
                    Exception e = new ArithmeticException();
                    throw e;
                }
                else{
                    int result = num1 /num2;
                    System.out.println(result);
                }

                
            }
            catch(Exception e){
                System.out.println("Enetr a valid number");
            }
    }
}
