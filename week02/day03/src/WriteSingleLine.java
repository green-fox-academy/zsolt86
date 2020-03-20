// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "writeLine.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: writeLine.txt"

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {

        String nameOfTheFile = "textFiles/writeFile.txt";
        writeMyName(nameOfTheFile);
    }

    public static void writeMyName(String fileName) {
        List<String> name = new ArrayList<>();
        name.add("Zsolt Lengyel");

        Path filePath = Paths.get(fileName);
        try {
            Files.write(filePath, name);
            System.out.println(name + " is writing into " + filePath);
        } catch (Exception e) {
            System.out.print("Something wrong, unable to write file: " + filePath);
        }
    }
}