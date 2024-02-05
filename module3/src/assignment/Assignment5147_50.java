package assignment;

import java.util.Scanner;

/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Jan 30, 2024
 * Updated: Feb 5, 2024
 */
public class Assignment5147_50 {

    /**
     * Description: Main function and program entrance of the assignment3, 5.14.7-No50
     *
     * @param args
     */
    public static void main(String[] args) {
        // Getting user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        int temperature = scanner.nextInt();
        String season = "";

        if(temperature < -5 || temperature > 110) {
            System.out.println("The temperature is out of range");
            return;
        }

        // Parsing input
        if(temperature >= 90) {
            season = "summer";
        } else if (temperature >= 70 && temperature < 90) {
            season = "spring";
        } else if (temperature >= 50 && temperature < 70) {
            season = "fall";
        } else {
            season = "winter";
        }

        // Printing results
        System.out.println("The season is " + season + ".");
    }
}
