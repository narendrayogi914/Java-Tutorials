import java.util.*;

class MyThread extends Thread
{
    public void run(){
        System.out.println("Child Tnread");

    }
}

class ThreadCreation{
    public static void main(String[] args) {
        MyThread t = new MyThread();
    t.start();
        
    }
}