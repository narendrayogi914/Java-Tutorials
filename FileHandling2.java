import java.io.*;

public class FileHandling2 {
    public static void main(String[] args) 
     {
        // File dir = new File("PWJAVA");
        // System.out.println(dir.isDirectory());
        // dir.mkdir();
        // File file = new File(dir,"MyFile.txt");
        // try{
        //     file.createNewFile();
        // }
        // catch(Exception e){
        //     System.out.println("Error"+ e.getMessage());
        // }
        // System.out.println(file.isFile());
        int count = 0;
        File f = new File("C:\\Users\\naren\\OneDrive - itechsolution\\Desktop\\java");
        String str[] = f.list();
        for(String name: str)
        {
            count++;
            System.out.println(name);
        }
        System.out.println("no of files are " + count);



    }
}
