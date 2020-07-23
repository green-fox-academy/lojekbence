import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a filename:");
        String fileName = scanner.nextLine();
        System.out.println(counter(fileName));
    }
    public static int counter(String fileName) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            return lines.size();
        } catch (IOException e) {
            System.out.println(0);
            return 0;
        }
    }
}
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.