import java.util.Scanner;

/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Feb 12, 2024
 * Updated: Feb 12, 2024
 */
public class Assignment614760 {

    private static final String commercialWebReg = "^([a-zA-Z0-9-]+\\.)*[a-zA-Z0-9-]+\\.(com|COM)$";

    /**
     * Description: Main function and program entrance of the assignment4, 6.14.7-No60
     *
     * @param args
     */
    public static void main(String[] args) {
        // Getting user input
        System.out.println("<Type \"stop\" to end the program>");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a web address: ");
        int res = 0;

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();

            // Determine whether user typed in STOP
            if("stop".equalsIgnoreCase(input)) {
                break;
            }

            // Determine if it is a web and if it is commercial
            if(input != null && input.matches(commercialWebReg)) {
                res++;
            }
        }

        // Printing result
        System.out.println("The number of commercial websites entered " + res + ".");
    }
}
