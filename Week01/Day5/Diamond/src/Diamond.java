import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        double a = scanner.nextInt();
        System.out.println("\n");
        for (double i = 0; i < a; i++) { // i = sorindex
            for (double j = a-i; j>0; j--) {  // minden sorba egyre kevesebb space kerul, ahogy az index no
                System.out.print(" ");
            }
            for (double j = 0; j <= i; j++) { // soronkent egy space helyere egy csillag kerul
                System.out.print("*");
            }
            for (double j = i; j > 0; j--) {  // soronkent plusz egy csillag jobbra
                System.out.print("*");
            }
            System.out.println();
        }
        for (double i = a-1; i>=0; i--) {    // i = sorindex, de most a legnagyobbtol indul
            for (double j = i; j < a; j++) { // minden sorba egyre tobb space kerul
                System.out.print(" ");
            }
            for (double j = i; j >= 0; j--) {  // minden sorba egy csillagot levalt egy space
                System.out.print("*");
            }
            for (double j = 0; j < i; j++) {  // minden sorba eggyel kevesebb plusz csillag megy
                System.out.print("*");
            }
            System.out.println();
        }
    }
}