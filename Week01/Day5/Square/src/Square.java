import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gimme a number plz: ");
        int a = scanner.nextInt();
        System.out.println("\n");
        for (int i = 0; i < a; i++) {       // i = sorindex
            if (i==a-1 || i==0) {
                for (int j = a; j>0; j--) {     // j = oszlopindex
                    System.out.print("%");
                    }
            } else {
                System.out.print("%");
                for (int j = a-2; j>0; j--) {
                    System.out.print(" ");
                }
                System.out.print("%");

            }
            System.out.println();
        }
    }
}

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was