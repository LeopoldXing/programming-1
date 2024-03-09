package groupActivites.part1;

import java.util.Random;
import java.util.Scanner;

public class two
{
	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);
        System.out.print("Enter a starting integer > ");
        int start = scan.nextInt();
        int input;
        do {
            System.out.print("Enter an integer > ");
            input = scan.nextInt();
            if (input >= start && input != 20) {
                System.out.println(input);
            }
        } while (input != 20);


    }
}