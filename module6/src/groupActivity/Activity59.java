package groupActivity;

import java.util.Arrays;

/**
 * A class containing an array-returning method that takes a String as a parameter and returns the corresponding array of chars.
 *
 * @author Luping Xing
 * @version 1.0.0
 */
public class Activity59 {
    public static char[] reverseCharArray(char[] arrayInput) {
        char[] res = new char[arrayInput.length];
        int l = 0, r = arrayInput.length - 1;
        while(l <= r) {
            res[l] = arrayInput[r];
            res[r] = arrayInput[l];
            l++;
            r--;
        }

        return res;
    }

    public static void main(String[] args) {
        char[] originalArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("original String: " + Arrays.toString(originalArray));
        System.out.println("Expected: [e, d, c, b, a]");
        System.out.println("Actual: " + Arrays.toString(reverseCharArray(originalArray)));
    }

}
