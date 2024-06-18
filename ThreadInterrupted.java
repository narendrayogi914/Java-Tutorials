class Example implements Runnable
{
    public void run(){
        try{
            for(int i = 0 ; i<3;i++)
        {

            System.out.println("Focous is important");
            Thread.sleep(3000);
            

        }
        }
        catch(Exception e )
        {
            System.out.println("Thread Is Interrupted");

        }

    }
}

public class ThreadInterrupted {
    public static void main(String[] args) {
        Example e= new Example();
        Thread t = new Thread(e);
        t.start();
        t.interrupt();
        
    }
}
