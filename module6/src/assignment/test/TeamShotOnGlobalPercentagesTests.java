package assignment.test;
/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Mar 10, 2024
 * Updated: Mar 10, 2024
 */
import java.util.Arrays;

/**
 * A class for TeamShotOnGoalPercentages testing.
 *
 * @author Luping Xing [lxing2@rrc.ca]
 * @version 1.0.0
 */
public class TeamShotOnGlobalPercentagesTests {
    public static void main(String[] args) {
        // Test Unit: TeamShotOnGoalPercentages(int)
        System.out.println("TeamShotOnGoalPercentages(int)");
        // Test #1 - Initialize percentages array without data.
        System.out.println("Test #1 - Initialize percentages array without data.");
        TeamShotOnGoalPercentages teamShotOnGoalPercentages = new TeamShotOnGoalPercentages(4);
        System.out.println("Expected: [0, 0, 0, 0]");
        System.out.println("Actual: " + Arrays.toString(teamShotOnGoalPercentages.getPercentages()));
        System.out.println();

        // Test Unit: TeamShotOnGoalPercentages(double[])
        System.out.println("TeamShotOnGoalPercentages(double[])");
        // Test #1 - Initialize percentages array without data.
        System.out.println("Test #1 - Initialize percentages array with data.");
        teamShotOnGoalPercentages = new TeamShotOnGoalPercentages(new double[]{0.1, 0.5, 0.6, 0.3});
        System.out.println("Expected: [0.1, 0.5, 0.6, 0.3]");
        System.out.println("Actual: " + Arrays.toString(teamShotOnGoalPercentages.getPercentages()));
        System.out.println();

        // Test Unit: getPercentages() : double[]
        System.out.println("getPercentages() : double[]");
        // Test #1 - Returns a copy of the array used to initialize the object.
        System.out.println("Test #1 - Returns a copy of the array used to initialize the object.");
        double[] originalArray = new double[]{0.1, 0.5, 0.6, 0.3};
        teamShotOnGoalPercentages = new TeamShotOnGoalPercentages(originalArray);
        System.out.println("The hashcode of the array for initialization: " + originalArray.hashCode());
        System.out.println("The hashcode of the array returned: " + teamShotOnGoalPercentages.getPercentages().hashCode());
        System.out.println();

        // Test Unit: setPercentages(double[]) : void
        System.out.println("setPercentages(double[]) : void");
        // Test #1 - Updates the state of the percentages.
        System.out.println("Test #1 - Updates the state of the percentages.");
        teamShotOnGoalPercentages = new TeamShotOnGoalPercentages(new double[]{0.1, 0.5, 0.6, 0.3});
        teamShotOnGoalPercentages.setPercentages(new double[]{0.8, 0.9, 0.7, 0.3});
        System.out.println("Expected: [0.8, 0.9, 0.7, 0.3]");
        System.out.println("Actual: " + Arrays.toString(teamShotOnGoalPercentages.getPercentages()));
        System.out.println();

        // Test Unit: getSortedPercentages() : double[]
        System.out.println("getSortedPercentages() : double[]");
        // Test #1 - Returns a copy of the percentages array sorted in descending order.
        System.out.println("Test #1 - Returns a copy of the percentages array sorted in descending order.");
        teamShotOnGoalPercentages = new TeamShotOnGoalPercentages(new double[]{0.1, 0.5, 0.6, 0.3});
        System.out.println("Expected: [0.6, 0.5, 0.3, 0.1]");
        System.out.println("Actual: " + Arrays.toString(teamShotOnGoalPercentages.getSortedPercentages()));
        System.out.println();

        // Test Unit: getLowestPercentage() : double
        System.out.println("getLowestPercentage() : double");
        // Test #1 - Returns the correct lowest percentage value.
        System.out.println("Test #1 - Returns the correct lowest percentage value.");
        System.out.println("Expected: 0.1");
        System.out.println("Actual: " + teamShotOnGoalPercentages.getLowestPercentage(new double[]{0.1, 0.5, 0.6, 0.3}));
        System.out.println();

        // Test Unit: getAverageOfTopPlayers() : double
        System.out.println("getAverageOfTopPlayers() : double");
        // Test #1 - Returns the correct average of the top five players where the number of players is greater than 5.
        System.out.println("Test #1 - Returns the correct average of the top five players where the number of players is greater than 5.");
        teamShotOnGoalPercentages = new TeamShotOnGoalPercentages(new double[]{0.1, 0.5, 0.6, 0.3, 0.5, 0.8, 0.6});
        System.out.println("Expected: 0.6");
        System.out.println("Actual: " + teamShotOnGoalPercentages.getAverageOfTopPlayers());
        System.out.println();

        // Test #2 - Returns the correct average of the top five players where the number of players is less than 5.
        System.out.println("Test #1 - Returns the correct average of the top five players where the number of players is less than 5.");
        teamShotOnGoalPercentages = new TeamShotOnGoalPercentages(new double[]{0.1, 0.5, 0.8, 0.6});
        System.out.println("Expected: 0.5");
        System.out.println("Actual: " + teamShotOnGoalPercentages.getAverageOfTopPlayers());
        System.out.println();

        // Test Unit: toString() : String
        System.out.println("toString() : String");
        // Test #1 - Returns the correct String representation.
        System.out.println("Test #1 - Returns the correct String representation.");
        teamShotOnGoalPercentages = new TeamShotOnGoalPercentages(new double[]{0.1, 0.5, 0.6, 0.3, 0.5, 0.8, 0.6});
        System.out.println("Expected: ");
        System.out.println("--------------------\n" +
                "Player        SOG%\n" +
                "--------------------\n" +
                "1             0.1\n" +
                "2             0.5\n" +
                "3             0.6\n" +
                "4             0.3\n" +
                "5             0.5\n" +
                "6             0.8\n" +
                "7             0.6");
        System.out.println("Actual: \n" + teamShotOnGoalPercentages);
    }
}
