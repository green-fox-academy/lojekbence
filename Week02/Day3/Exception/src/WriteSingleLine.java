import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Scanner;

public class WriteSingleLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your name: ");
        String name = scanner.nextLine();
        writeName(name);
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"

    }
    public static void writeName(String name) {
        try {
            Path filePath = Paths.get("my-file.txt");
            Files.writeString(filePath, name);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}