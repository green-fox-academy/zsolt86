import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

/* Write a program that opens a file called "my-file.txt", then prints each line from the file.
   If the program is unable to read the file (for example it does not exist),
   then it should print the following error message: "Unable to read file: my-file.txt" */

public class PrintEachLine2 {
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("textFiles/my-file.txt");
            List<String> lines = Files.readAllLines(filePath);
            lines.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}