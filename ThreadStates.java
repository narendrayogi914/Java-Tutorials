class Demo implements Runnable
{
    public void run(){
        System.out.println("Child Thread Execution");
        try{
            Thread.sleep(3000);//go to block or waiting state

            
        }
        catch(Exception e)
        {
            System.out.println("Some Problems");

        }
        System.out.println("Child Thread Task Completed ");

    }
}

public class ThreadStates {
    public static void main(String[] args) {
        Demo d = new Demo();
        Thread t1 = new Thread(d);//New State
        t1.start();//Runnable State
        System.out.println("Main thread Started");


        
    }
}
