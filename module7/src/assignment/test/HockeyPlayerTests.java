package assignment.test;

import java.util.Arrays;

public class HockeyPlayerTests {
    public static void main(String[] args) {
        // Test Unit: HockeyPlayer(String, int)
        System.out.println("HockeyPlayer(String, int)");
        // Test #1 - Initialize percentages array without data.
        System.out.println("Test #1 - Initialize the name.");
        HockeyPlayer hockeyPlayer = new HockeyPlayer("John Smith", 8);
        System.out.println("Expected: John Smith");
        System.out.println("Actual: " + hockeyPlayer.getName());
        System.out.println();

        // Test #2 - Initialize the number.
        System.out.println("Test #2 - Initialize the number.");
        System.out.println("Expected: 8");
        System.out.println("Actual: " + hockeyPlayer.getNumber());
        System.out.println();

        // Test #3 - Initialize the goals.
        System.out.println("Test #3 - Initialize the goals.");
        System.out.println("Expected: 0");
        System.out.println("Actual: " + hockeyPlayer.getGoals());
        System.out.println();

        // Test #4 - Initialize the assists.
        System.out.println("Test #4 - Initialize the assists.");
        System.out.println("Expected: 0");
        System.out.println("Actual: " + hockeyPlayer.getAssists());
        System.out.println();

        // Test Unit: HockeyPlayer(String, int, int, int)
        System.out.println("HockeyPlayer(String, int, int, int)");
        // Test #1 - Initialize the name.
        System.out.println("Test #1 - Initialize the name.");
        hockeyPlayer = new HockeyPlayer("John Smith", 8, 5, 7);
        System.out.println("Expected: John Smith");
        System.out.println("Actual: " + hockeyPlayer.getName());
        System.out.println();

        // Test #2 - Initialize the number.
        System.out.println("Test #2 - Initialize the number.");
        System.out.println("Expected: 8");
        System.out.println("Actual: " + hockeyPlayer.getNumber());
        System.out.println();

        // Test #3 - Initialize the goals.
        System.out.println("Test #3 - Initialize the goals.");
        System.out.println("Expected: 0");
        System.out.println("Actual: " + hockeyPlayer.getGoals());
        System.out.println();

        // Test #4 - Initialize the assists.
        System.out.println("Test #4 - Initialize the assists.");
        System.out.println("Expected: 0");
        System.out.println("Actual: " + hockeyPlayer.getAssists());
        System.out.println();
    }
}
