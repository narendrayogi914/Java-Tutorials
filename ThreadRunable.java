import java.util.Scanner;
class Calc implements Runnable
{
    public void run(){
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
}
class Message implements Runnable
{
    public void run(){
        
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

public class ThreadRunable {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        Calc c1 = new Calc();
        Message m2 = new Message();


        //creating the object of the Thread
         Thread t1 = new Thread(c1);

         Thread t2 = new Thread(m2);

        t1.start();
        t2.start();
       



    }
}
