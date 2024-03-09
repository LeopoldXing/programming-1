package groupActivites.part3;

import java.util.Scanner;

public class GroupActivityPart3 {
    public static void main(String[] args) {
        System.out.print("Enter a whole decimal number:  ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input + " in binary is " + int2Binary(input));
    }

    /**
     * Converts an integer to its binary representation.
     *
     * @param input the integer to be converted to binary
     * @return the binary string representation of the input integer
     */
    public static String int2Binary(int input) {
        if (input == 0) return "0";
        StringBuilder binaryString = new StringBuilder();

        while (input > 0) {
            int remainder = input % 2;
            binaryString.insert(0, remainder);
            input /= 2;
        }

        return binaryString.toString();
    }
}
