import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {0,1,2,3,4};   // array
        for (int i = 0; i < 5; i++) {
            System.out.println("Pls, give "+(5-i)+" more integer(s):");
            numbers[i] = scanner.nextInt();    // get every value from numbers
        }
        int sum = 0;
        for (int i : numbers) {
            sum = sum + i;
        }
        double avg = sum/5;
        System.out.println("Sum: " + sum + " Avg: " + avg);
    }
}

// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4