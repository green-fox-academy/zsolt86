// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteMultipleLines {

    public static void main(String[] args) {

        System.out.print("Give me a filename: ");
        Scanner sc1 = new Scanner(System.in);
        String filePath = "textFiles/" + sc1.nextLine() + ".txt";

        System.out.print("Give me some text: ");
        Scanner sc2 = new Scanner(System.in);
        String textInput = sc2.nextLine();

        System.out.print("Give me a number: ");
        Scanner sc3 = new Scanner(System.in);
        int lines = sc3.nextInt();

        try {
            writeLines(filePath, textInput, lines);
        } catch (Exception e) {
            System.out.println("Unable to write file: " + filePath);
        }
    }

    public static void writeLines(String filePath, String textInput, int lines) throws IOException {

        ArrayList<String> content = new ArrayList<>();

        for (int row = 0; row < lines; row++) {
            content.add(textInput);
        }

        Files.write(Paths.get(filePath), content);

        System.out.println(filePath + " file is created and the: '" + textInput + "' is writing to it, '" + lines + "' times.");
    }

}
