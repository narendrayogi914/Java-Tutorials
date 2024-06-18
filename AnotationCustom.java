import java.lang.annotation.*;
@Target({ElementType.TYPE,ElementType.METHOD , ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
    String country() default "India";
    int age() default 25;
}

@CricketPlayer
class Virat{
    @CricketPlayer
    private int innings;
    private int runs;
    @CricketPlayer
    public int getInnings(){
        return innings;
    }
    public void setInnings(int innings)
    {
        this.innings=innings;
    }
    public int getRuns(){
        return runs;
    }
    public void setRuns(int runs){
        this.runs=runs;
    }
}


public class AnotationCustom {
    public static void main(String[] args) {
         Virat v= new Virat();
         v.setInnings(300);
         v.setRuns(20000);
         System.out.println("Innings: "+v.getInnings());
         System.out.println("Runs: "+v.getRuns());



         //Refelxction API 

         Class c =  v.getClass();
        

         Annotation a = c.getAnnotation(CricketPlayer.class);
         CricketPlayer cp = (CricketPlayer)a;
         String d = cp.country();
         System.out.println(d);
         int age = cp.age();
         System.out.println(age);

         
    }
}
