public class ThreadMain {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        String name = Thread.currentThread().getName();
        System.out.println("The Name of Main Thread is : " +name);
        System.out.println("Priority of Main Thread is : "+ Thread.currentThread().getPriority());
        
        
        System.out.println("After Changning");
        Thread t = Thread.currentThread();
        t.setName("My Main Thread");
        t.setPriority(1);
        
        String tname = Thread.currentThread().getName();
        System.out.println("The Name of Main Thread is : " +tname);
        System.out.println("Priority of Main Thread is : "+ Thread.currentThread().getPriority());


    }
}
