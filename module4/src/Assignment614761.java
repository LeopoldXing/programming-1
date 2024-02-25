import java.util.Scanner;

/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Feb 12, 2024
 * Updated: Feb 12, 2024
 */
public class Assignment614761 {

    /**
     * Description: Main function and program entrance of the assignment4, 6.14.7-No61
     *
     * @param args
     */
    public static void main(String[] args) {
        // Initialization
        Scanner scanner = new Scanner(System.in);
        int maxVal = 0;
        int minVal = 100;
        int sum = 0;

        // Looping
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            int input = scanner.nextInt();

            // Validating input
            while (input < 0 || input > 100) {
                System.out.print("Invalid grade. Enter again: ");
                input = scanner.nextInt();
            }

            // Update max min sum value
            sum += input;
            maxVal = Math.max(maxVal, input);
            minVal = Math.min(minVal, input);
        }

        // Printing result
        System.out.println("The lowest grade is " + minVal + ".");
        System.out.println("The highest grade is " + maxVal + ".");
        System.out.println("The average grade is " + sum / 10F + ".");
    }
}
