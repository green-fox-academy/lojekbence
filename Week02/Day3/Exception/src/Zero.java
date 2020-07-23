import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = scanner.nextInt();
        double result = number/10;
        if(number == 0) {
            System.out.println("fail");
        } else {
            System.out.println(result);
        }
    }
}
// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0