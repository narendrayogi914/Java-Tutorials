import java.io.*;

public class FileHandlingWrite {
    public static void main(String[] args) throws IOException {
        File dir = new File("PW");
        File file = new File(dir, "khusi.txt");
        // file.createNewFile();
        FileWriter fw = new FileWriter(file , true);
        fw.write("Hii i am narendra yogi and i want to make a java developer in this course ");
        fw.write("\n");
        fw.write(65);
        fw.write("\n");
        fw.write(97);
        fw.write("\n");
        char ch[] = { 'j', 'a', 'v', 'a' };
        fw.write(ch);
        fw.write("\n");
        fw.close();//must be written 
        fw.flush();
        System.out.println("Written operation successfully ");

    }
}
