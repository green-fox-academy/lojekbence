import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give an integer plz: ");
        Integer user = scanner.nextInt();
        // even - odd
        if (user % 2 == 0) {
            System.out.println("The number is 'EVEN'");
        }else {
            System.out.println("The number is 'ODD'");
        }
        // OneTwoALot
        if (user <= 0) {
            System.out.println("Not enough");
        }
        if (user == 1) {
            System.out.println("One");
        }
        if (user == 2) {
            System.out.println("Two");
        }
        if (user > 2) {
            System.out.println("A lot");
        }
    }
}