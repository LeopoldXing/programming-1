import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Jan 15, 2024
 * Updated: Jan 22, 2024
 */
public class Assignment3187_63 {
    /**
     * Description: Main function and program entrance of the assignment2, 3.18.7-No63
     *
     * @param args
     */
    public static void main(String[] args) {
        // Initialization
        Scanner scanner = new Scanner(System.in);
        int [] numberOfYears = {5, 10, 20};
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.CANADA);

        // Get user input
        System.out.print("Enter the investment amount: ");
        double investment = scanner.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double interestRate = scanner.nextDouble();

        // Calculating, formatting and printing result
        for(int i = 0; i < numberOfYears.length; i++) {
            // Calculating result
            double futureReturns = investment * Math.pow(1 + interestRate, numberOfYears[i]);

            // formatting result
            String formattedResult = formatter.format(futureReturns);

            // Displaying result
            System.out.println("The future value after " + numberOfYears[i] + " years is " + formattedResult + ".");
        }
    }
}
