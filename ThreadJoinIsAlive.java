import java.util.*;


class Printing implements Runnable
{
    public void run(){
        try{
            for(int i = 0 ; i<3 ; i++)
            {
                System.out.println("Focous is important");
                Thread.sleep(3000);
            }
        }catch(Exception e)
        {
            System.out.println("Some Problem");
    
        }
    }
    
}

public class ThreadJoinIsAlive {
    public static void main(String[] args) throws Exception
    {
        System.out.println("Main therad started");

        Printing p = new Printing();
         Thread t = new Thread(p);
         System.out.println(t.isAlive());
         t.start();
         System.out.println(t.isAlive());
         t.join();
         System.out.println(t.isAlive());
         System.out.println("Main Thread Finished the work ");

        
    }
}
