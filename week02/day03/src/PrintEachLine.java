import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintEachLine {
    public static void main(String[] args) {

        /* Write a program that opens a file called "my-file.txt", then prints each line from the file.
         If the program is unable to read the file (for example it does not exist),
         then it should print the following error message: "Unable to read file: my-file.txt" */

        try {
            Scanner input = new Scanner(new File("textFiles/my-file.txt"));
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }

        } catch (FileNotFoundException fNf) {
            System.out.println("File not found! Unable to read file: my-file.txt");
        } catch (Exception e) {
            System.out.println("Something wrong!");
        }


    }
}