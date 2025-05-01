import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StudentInfoReader {
    public static void main(String[] args) {
        // Try with resources to automatically close the FileReader
        try (FileReader reader = new FileReader("student.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: student.txt not found. Please ensure:");
            System.out.println("1. The file exists in the same directory as the program");
            System.out.println("2. The file is named exactly 'student.txt' (case sensitive)");
            System.out.println("Current directory: " + System.getProperty("user.dir"));
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file. Details: " + e.getMessage());
        }
    }
}