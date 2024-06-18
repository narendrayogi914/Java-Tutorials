class Library implements Runnable{
    String res1 = new String("Java");
    String res2 = new String("SQL");
    String res3 = new String("DSA");
    public void run(){
        String name = Thread.currentThread().getName();
        if (name.equals("Student-1")) {
            try{
                Thread.sleep(3000);
                synchronized(res1){
                    System.out.println("Student 1 has acc " + res1);
                    Thread.sleep(3000);
                    synchronized(res2){
                        System.out.println("Student 1 has acc " + res2);
                        Thread.sleep(3000);
                        synchronized(res3){
                            System.out.println("System 1 has acc " + res3);
                            Thread.sleep(3000); 

                        }
                    }
                }
            }
            catch(Exception e){
                System.out.println("Some Problem");

            }
            
        }
        else{
            try{
                Thread.sleep(3000);
                synchronized(res3){
                    System.out.println("Student 2 has acc " + res1);
                    Thread.sleep(3000);
                    synchronized(res2){
                        System.out.println("Student 2 has acc " + res2);
                        Thread.sleep(3000);
                        synchronized(res1){
                            System.out.println("System 2 has acc " + res3);
                            Thread.sleep(3000); 

                        }
                    }
                }
            }
            catch(Exception e){
                System.out.println("Some Problem");

            }

        }

    }
}

public class ThreadDeadlock {
    public static void main(String[] args) {
        Library lib = new Library();
        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);
        t1.setName("Student-1");
        t2.setName("Student 2");
        t1.start();
        t2.start();
    }
}
