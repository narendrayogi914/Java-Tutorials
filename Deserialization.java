import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

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

public class Deserialization {
    public static void main(String[] args) throws   Exception, IOException
     {
        FileInputStream fis = new FileInputStream("java.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Cricketer cr = (Cricketer)ois.readObject();
        cr.display();
        ois.close();
        
        
    }
}
