import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Jan 15, 2024
 * Updated: Jan 15, 2024
 */
public class Assignment3187_63 {
    /**
     * Description: Main function and program entrance of the assignment2, 3.18.7-No63
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numberOfYears = {5, 10, 20};
        NumberFormat formatter = NumberFormat.getInstance(Locale.CANADA);

        // Get user input
        System.out.println("Enter the investment amount: ");
        String investment = scanner.nextLine();
        System.out.println("Enter the annual interest rate: ");
        String interestRate = scanner.nextLine();

        // Parsing the number


        // Calculating and formatting result


        // Displaying order
        for(int i = 0; i < numberOfYears.length; i++) {
            System.out.println("The future value after " + numberOfYears[i] + " years is {future_value}.");
        }
    }
}
