import java.util.Scanner;

/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Jan 15, 2024
 * Updated: Jan 15, 2024
 */
public class Assignment3187_65 {
    /**
     * Description: Main function and program entrance of the assignment2, 3.18.7-No65
     *
     * @param args
     */
    public static void main(String[] args) {
        // Initialization
        Scanner scanner = new Scanner(System.in);

        // Getting user input
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        // Parsing input to get username and domain name
        String[] res = email.split("@");
        String username = res[0];
        String domain = res[1];

        // Printing result
        System.out.println("The username is " + username + ".");
        System.out.println("The domain is " + domain + ".");
    }
}
