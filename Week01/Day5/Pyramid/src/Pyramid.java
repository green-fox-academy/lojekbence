import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        int height;     // sorok szama
        String space = " ";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gimme a number plz:");
        height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = height-i; j>1; j--) {
                System.out.print(space);
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int r = i; r != 0; r--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}