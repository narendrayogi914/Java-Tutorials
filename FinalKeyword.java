// if a class is marked as a final ,
//  then the class wan't participate in inheritance , 
//  if we try to do so then it would result in "CompilerTime Error"
        // Eg. String , StringBuffer , Integer, Float 

// final class Animal{ 
//     final void sleep(){
//         System.out.println("zzzzz");
//     }
// }
 class Animal{
    final int age = 18;
    final void sleep(){
        System.out.println("zzzzz");
    }
}
class Tiger extends Animal{
    int age = 19;

    void sleep(){
        System.out.println("Tiger sleep");//cannot override final method 
    }
}

public class FinalKeyword {
    public static void main(String[] args) {

    }
}
