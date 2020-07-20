public class Factorial {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(factorio(a));
    }
    public static int factorio(int number) {
        int fact = 1;
        for (int i = number; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }
}
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial