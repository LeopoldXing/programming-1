package groupActivity.part1;

import java.util.Arrays;

/**
 * A class containing  an array-returning method that takes an array of ints as a parameter and returns an array of booleans, assigning true for any
 * element of the parameter array greater than or equal to 100; and false otherwise.
 *
 * @author Luping Xing
 * @version 1.0.0
 */
public class Activity61 {

    private static boolean[] isLargerThan100 (int[] inputArray) {
        boolean[] res = new boolean[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            res[i] = inputArray[i] >= 100;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] inputArray = {50, 100, 150, 200, 250};

        System.out.println("inputArray: " + Arrays.toString(inputArray));
        System.out.println("Expected: [false, true, true, true, true]");
        System.out.println("Actual: " + Arrays.toString(isLargerThan100(inputArray)));
    }

}
