import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chickens:");
        Integer userC = scanner.nextInt();
        System.out.println("Pigs:");
        Integer userP = scanner.nextInt();
        Integer legs = userC*2+userP*4;
        System.out.println("Animals legs: "+legs);
    }
}