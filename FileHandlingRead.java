import java.io.*;;


public class FileHandlingRead {
    public static void main(String[] args) throws IOException
    
    {
        File dir = new File("PW");
        File file = new File(dir,"khusi.txt");

        FileReader fd = new FileReader(file);
        char ch[] = new char[(int)file.length()];

    //    int i =  fd.read();
    fd.read(ch);
    for(char data:ch){
        System.out.print(data);

    }
       
    //    System.out.println((char)i);
    //    while (i!=-1) {
    //     System.out.println(i+ "-------->");
    //     System.out.println((char)i);
    //     i = fd.read(); 
    //    }


        
    }
}
