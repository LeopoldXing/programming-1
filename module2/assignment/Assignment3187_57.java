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
public class Assignment3187_57 {

    /**
     * Description: Main function and program entrance of the assgiment2, 3.18.7-No57
     *
     * @param args
     */
    public static void main(String[] args) {
        double quartersAmount = 0;
        double dimesAmount = 0;
        double nickelsAmount = 0;
        double sum = 0;

        // Get users' input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of quarters: ");
        if (scanner.hasNextDouble()) {
            quartersAmount = scanner.nextDouble();
            sum += quartersAmount * 0.25;
        }

        System.out.print("Enter the number of dimes: ");
        if (scanner.hasNextDouble()) {
            dimesAmount = scanner.nextDouble();
            sum += dimesAmount * 0.1;
        }

        System.out.print("Enter the number of nickels: ");
        if (scanner.hasNextDouble()) {
            nickelsAmount = scanner.nextDouble();
            sum += nickelsAmount * 0.05;
        }

        // Formatting numbers
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.CANADA);
        String formattedCurrency = formatter.format(sum);

        // Print out the result
        System.out.println("The amount of money is " + formattedCurrency + ".");
    }
}