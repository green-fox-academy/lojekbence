import java.util.Scanner;

public class ParametricAvarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = scanner.nextInt();
        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Type a number: ");
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i : numbers) {
            sum+=i;
        }
        double avg = sum * 1.0 / number;
        System.out.println("Sum: "+sum+", Avg: "+avg);
    }
}
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4