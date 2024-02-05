package assignment;

import java.util.Scanner;

/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Jan 30, 2024
 * Updated: Jan 30, 2024
 */
public class Assignment5147_49 {

    /**
     * Description: Main function and program entrance of the assignment3, 5.14.7-No49
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user input
        System.out.print("Enter a web address: ");
        String address = scanner.nextLine();

        // Parsing
        String[] splitedAddress = address.split("\\.");
        String topDomain = splitedAddress[splitedAddress.length - 1];
        String addressType = "";
        if("com".equalsIgnoreCase(topDomain)) {
            addressType = "business";
        } else if ("gov".equalsIgnoreCase(topDomain)) {
            addressType = "government";
        } else if ("edu".equalsIgnoreCase(topDomain)) {
            addressType = "university";
        } else if ("org".equalsIgnoreCase(topDomain)) {
            addressType = "organization";
        } else {
            System.out.println("The web address is for another entity.");
            return;
        }

        // Printing result
        System.out.println("You entered a " + addressType + " web address.");
    }
}
