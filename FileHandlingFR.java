import java.io.*;

public class FileHandlingFR {
    public static void main(String[] args)  throws IOException
    {
        File dir = new File("PW");
        File file = new File(dir , "khusi.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        char ch[] = new char[(int)file.length()];
        br.read(ch);
        for(char data : ch)
        {
            System.out.print(data);
        }


    }
}
