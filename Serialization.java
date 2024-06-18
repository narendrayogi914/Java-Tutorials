import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;
class Cricketer implements Serializable
{
    private String name;
    transient private int age;
    private int runs;
    public Cricketer(String name , int age , int runs) 
    {
        this.name = name;
        this.age = age;
        this.runs = runs;

    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Runs: "+runs);

    }


}

public class Serialization {
    public static void main(String[] args) throws Exception , IOException
    
    {
        // Cricketer c1 = new Cricketer("Virat Kohli", 35, 1500);
        // FileOutputStream fos = new FileOutputStream("pw.txt");
        // BufferedOutputStream boos = new BufferedOutputStream(fos);
        // File file = new File("pw.txt");
        // if (!file.exists()) {
        //     file.createNewFile();
            
        // }
        // else{
        // ObjectOutputStream oos = new ObjectOutputStream(boos);
        // oos.writeObject(c1);
        // c1.display();
        // oos.flush();
        // oos.close(); 
        // fos.close();
        // }
        FileInputStream fis = new FileInputStream("pw.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Cricketer cr = (Cricketer)ois.readObject();
        cr.display();
        ois.close();
        

        
        

    }
}
