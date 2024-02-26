import java.util.Scanner;

/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Feb 12, 2024
 * Updated: Feb 12, 2024
 */
public class Assignment614760 {

    /**
     * Description: Main function and program entrance of the assignment4, 6.14.7-No60
     *
     * @param args
     */
    public static void main(String[] args) {
        // Getting user input
        System.out.println("<Type \"stop\" to end the program>");
        Scanner scanner = new Scanner(System.in);
        int res = 0;

        while (true) {
            System.out.print("Enter a web address: ");
            String webAddress = scanner.nextLine().toLowerCase();
            if ("stop".equals(webAddress)) {
                break;
            }
            if (webAddress.endsWith(".com") && !webAddress.equals(".com")) {
                res++;
            }
        }

        System.out.println("The number of commercial websites entered is " + res + ".");
    }
}
