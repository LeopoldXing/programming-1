package assignment;

import java.util.Scanner;

public class Assignment5147_49_revisited {

    /**
     * Description: Main function and program entrance of the assignment3, 5.14.7-No49 revisited
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
        String topDomain = splitedAddress[splitedAddress.length - 1].toLowerCase();
        switch (topDomain) {
            case "com":
                System.out.println("You entered a business web address.");
                break;
            case "gov":
                System.out.println("You entered a government web address.");
                break;
            case "edu":
                System.out.println("You entered a university web address.");
                break;
            case "org":
                System.out.println("You entered a organization web address.");
                break;
            default:
                System.out.println("The web address is for another entity.");
        }
    }
}
