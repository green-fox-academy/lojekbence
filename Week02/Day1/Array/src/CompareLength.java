public class CompareLength {
    public static void main(String[] args) {
        int fisrtArrayOfNumbers[] = {1, 2, 3};
        int secondArrayOfNumbers[] = {4, 5};
        if (secondArrayOfNumbers.length > fisrtArrayOfNumbers.length) {
            System.out.println("secondArrayOfNumbers is longer");
        }
    }
}
// - Create an array variable named `firstArrayOfNumbers`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `secondArrayOfNumbers`
//   with the following content: `[4, 5]`
// - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
//   elements than `firstArrayOfNumbers`