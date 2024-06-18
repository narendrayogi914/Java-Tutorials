import java.io.*;

public class FileHandlingFWFR {
    public static void main(String[] args) throws IOException {
        // Create a directory named "PW"
        File dir = new File("PW");
        if (!dir.exists()) {
            dir.mkdir();
        }

        // Create a file named "khusi.txt" inside the "PW" directory
        File file = new File(dir, "khusi.txt");

        // Use try-with-resources to ensure that the writers are closed properly
        try (FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw)) {
             
            // Write "java" to the file
            bw.write("java");
            bw.newLine();
            
            // Write the integer 65 as a character to the file
            bw.write(65);
            bw.newLine();
            
            // Write a char array to the file
            char[] ch = {'p', 'w', 's', 'j'};
            bw.write(ch);
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
