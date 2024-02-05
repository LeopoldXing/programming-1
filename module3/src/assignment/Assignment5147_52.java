package assignment;

import java.util.Scanner;

/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Jan 30, 2024
 * Updated: Jan 30, 2024
 */
public class Assignment5147_52 {

    /**
     * Description: Main function and program entrance of the assignment3, 5.14.7-No52
     *
     * @param args
     */
    public static void main(String[] args) {
        // Getting user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        String response = "";

        // Parsing input
        if("admin".equals(username)) {
            // username is admin
            if("open".equals(password)) {
                // password is correct
                response = "Welcome.";
            } else {
                // password is incorrect
                response = "Wrong password";
            }
        } else if ("open".equals(password)) {
            // password is correct, but the username is not admin
            response = "Wrong user ID.";
        } else {
            response = "Sorry, wrong ID and password.";
        }

        // Printing result
        System.out.println(response);
    }
}
