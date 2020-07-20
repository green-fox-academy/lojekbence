import java.lang.reflect.Array;
import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array

        //  Example:
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }
//    public static String subInt(int value, int[] arr) {
//        int[] solution = new int[0];
//        int index = 0;
//        boolean found = false;
//        while (true) {
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == value) {
//                    solution[index] = new int[] {i};
//                    found = true;
//                }
//             }
//        }
//        if (found == true) {
//            return Arrays.toString(solution);
//        }
//    }
}