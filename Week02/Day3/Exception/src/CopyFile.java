import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a file name that u want to copy:");
        String file = scanner.nextLine();
        System.out.println("Type the name of copy: ");
        String file2 = scanner.nextLine();
        copy(file, file2);
    }

    public static void copy(String file, String file2) {
        try {
            List<String> copied = Files.readAllLines(Paths.get(file));
            List<String> copied2 = new ArrayList();
            for (int i = 0; i < copied.size(); i++) {
                copied2.add(copied.get(i));
            }
            Path filePath = Paths.get(file2);
            Files.write(filePath, copied2);
            System.out.println(true);
        } catch (IOException e) {
            System.out.println(false);
        }
    }
}
// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful