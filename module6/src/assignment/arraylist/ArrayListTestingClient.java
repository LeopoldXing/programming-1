package assignment.arraylist;
/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Mar 10, 2024
 * Updated: Mar 10, 2024
 */

import assignment.library.TeamShotOnGoalPercentages;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * This class will contain an ArrayList of TeamShotOnGoalPercentages objects to demonstrate my understanding of ArrayList
 *
 * @author Luping Xing [lxing2@rrc.ca]
 * @version 1.0.0
 */
public class ArrayListTestingClient {
    public static void main(String[] args) {
        /* 1. Create an instance of an ArrayList that will store three TeamShotOnGoalPercentages objects. Each element in the ArrayList represents a team of players. */
        ArrayList<TeamShotOnGoalPercentages> teamShotPercentageList = new ArrayList<>(3);

        /* 2. Prompt the user for the number of players on the team. */
        System.out.print("Enter the number of players per team: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers = scanner.nextInt();

        /* 3. Add three new TeamShotOnGoalPercentages objects to the ArrayList. */
        teamShotPercentageList.add(new TeamShotOnGoalPercentages(new Random().doubles(numberOfPlayers, 0, 1).toArray()));
        teamShotPercentageList.add(new TeamShotOnGoalPercentages(new Random().doubles(numberOfPlayers, 0, 1).toArray()));
        teamShotPercentageList.add(new TeamShotOnGoalPercentages(new Random().doubles(numberOfPlayers, 0, 1).toArray()));

        /* 4. Use the enhanced for loop to print each of the TeamShotOnGoalPercentages objects to the console. */
        for (TeamShotOnGoalPercentages teamShotOnGoalPercentages : teamShotPercentageList) {
            System.out.println(teamShotOnGoalPercentages);
        }

        /* 5.1 Print a line containing the following text: “LAST ELEMENT BEFORE REMOVE:”. */
        System.out.println("LAST ELEMENT BEFORE REMOVE:");
        /* 5.2 Print the value of the final element in the ArrayList under the heading. */
        System.out.println(teamShotPercentageList.getLast());

        /* 6. Remove the final TeamShotOnGoalPercentages objects from the ArrayList. */
        teamShotPercentageList.removeLast();

        /* 7.1 Print a line containing the following text: “LAST ELEMENT AFTER REMOVE:”. */
        System.out.println("LAST ELEMENT AFTER REMOVE:");
        /* 7.2 Trim the ArrayList and print the value of the final element in the ArrayList under the heading. */
        teamShotPercentageList.trimToSize();
        System.out.println(teamShotPercentageList.getLast());
    }
}
