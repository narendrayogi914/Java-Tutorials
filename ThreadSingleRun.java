import java.util.*;
class MyThread extends Thread
{
    public void run()
    {
        String tname = Thread.currentThread().getName();
        if (tname.equals("Calc")) {
            
            cal();
            
        }
        else{
            importantMessage();
        }
    }
    public void cal()
    {
        System.out.println("Calculation Task Started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        System.out.println("Enter the number 2");
        int num2 = sc.nextInt();
        int res = num + num2;
        System.out.println(res);
        System.out.println("Calculation Task Ended");

    }
    public void importantMessage()
    {
        System.out.println("Displaying Important Message task start");
        try{
            for(int i =0;i<3;i++)
        {
            System.out.println("Focus is more important to master skills ");
            Thread.sleep(2000);

        }
        }

        catch(Exception e){
            System.out.println("Exception Handled" + e.getMessage());
        }

        
        System.out.println("Displaying Importnat message task ended");
    }
}

public class ThreadSingleRun {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();

        MyThread thread2 = new MyThread();
        thread1.setName("Calc");
        thread2.setName("Print");

        thread1.start();
        thread2.start();


        
    }
}
