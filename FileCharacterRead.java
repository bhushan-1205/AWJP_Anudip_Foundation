import java.io.FileReader;
import java.io.IOException;

public class FileCharacterRead {

    public static void main(String[] args) {

        int ch;
        int count = 0;


        String filePath = "input.txt";

        try (FileReader fr = new FileReader(filePath)) {

        
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
                count++;
            }

           
            System.out.println("\n\nTotal number of characters: " + count);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
