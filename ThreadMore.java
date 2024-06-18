import java.util.Scanner;
class Calc extends Thread
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
class Message extends Thread
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

public class ThreadMore {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        Calc t = new Calc();
        Message t2 = new Message();
        t.start();
        t2.start();
       



    }
}
