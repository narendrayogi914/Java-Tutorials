import java.io.*;

public class FileHandlingPW {
    public static void main(String[] args) throws IOException
     {
        File dir = new File("PW");
        File file = new File(dir, "khusi.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.write(97);
        pw.write("\n");
        pw.println("java");
        pw.println(100);
        pw.println('a');
        pw.println(true);
        pw.close();
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        char ch[] = new char[(int)file.length()];
        br.read(ch);
        for(char data : ch){
            System.out.print(data);
        }



    }
}
