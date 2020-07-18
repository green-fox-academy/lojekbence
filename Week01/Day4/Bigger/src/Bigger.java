import java.util.Scanner;

public class Bigger {
    public static void main(String[] args) {
        int[] user = {0,0};
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Type a number. ("+(2-i)+" left)");
            user[i] = scanner.nextInt();
        }
        if (user[0] < user[1]) {
            System.out.println(user[1] + " is the bigger one");
        } else {
            System.out.println(user[0] + " is the bigger one");
        }
    }
}