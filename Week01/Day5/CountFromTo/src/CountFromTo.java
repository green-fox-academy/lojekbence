import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme a number plez: ");
        a = scanner.nextInt();
        System.out.println("Gimme another number plez: ");
        b = scanner.nextInt();
        if (a < b) {
            for (int i = a; i<b; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("The second number should be bigger.");
        }
    }
}