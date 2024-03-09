package groupActivites.part1;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        do {
            System.out.print("Enter a number (0 or 100 to exit): ");
            number = scanner.nextInt();
            if (number != 0 && number != 100) {
                sum += number;
            }
        }
        while (number != 0 && number != 100);
        System.out.println("Sum of numbers entered: " + sum);
    }
}