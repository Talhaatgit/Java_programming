import java.io.*;

public class FileLineReader {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(reader);

            System.out.println("First line of file: " + br.readLine());

            br.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: The specified file was not found!");
        }
        catch (IOException e) {
            System.out.println("Error: Unable to read the file!");
        }
    }
}
