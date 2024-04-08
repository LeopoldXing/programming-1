package assignment.test;

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
        System.out.println("Expected: 5");
        System.out.println("Actual: " + hockeyPlayer.getGoals());
        System.out.println();

        // Test #4 - Initialize the assists.
        System.out.println("Test #4 - Initialize the assists.");
        System.out.println("Expected: 7");
        System.out.println("Actual: " + hockeyPlayer.getAssists());
        System.out.println();

        // Test Unit: Player Class Members | getName() : String
        System.out.println("Tests for Player Class Members");
        System.out.println("getName() : String");
        // Test #1 - setName(String) : void
        System.out.println("Test #1 - Updates the state of name.");
        hockeyPlayer = new HockeyPlayer("John Smith", 8);
        hockeyPlayer.setName("John Snow");
        System.out.println("Expected: John Snow");
        System.out.println("Actual: " + hockeyPlayer.getName());
        System.out.println();

        // Test Unit: setNumber(int) : void
        System.out.println("setNumber(int) : void");
        // Test #1 - setName(String) : void
        System.out.println("Test #1 - Updates the state of number.");
        hockeyPlayer = new HockeyPlayer("John Smith", 8);
        hockeyPlayer.setNumber(10);
        System.out.println("Expected: 10");
        System.out.println("Actual: " + hockeyPlayer.getNumber());
        System.out.println();

        // Test Unit: setGoals(int) : void
        System.out.println("setGoals(int) : void");
        // Test #1 - Updates the state of goals.
        System.out.println("Test #1 - Updates the state of goals.");
        hockeyPlayer = new HockeyPlayer("John Smith", 8);
        hockeyPlayer.setNumber(10);
        System.out.println("Expected: 10");
        System.out.println("Actual: " + hockeyPlayer.getNumber());
        System.out.println();

        // Test Unit: setAssists(int) : void
        System.out.println("setAssists(int) : void");
        // Test #1 - Updates the state of assists.
        System.out.println("Test #1 - Updates the state of assists.");
        hockeyPlayer = new HockeyPlayer("John Smith", 8);
        hockeyPlayer.setAssists(8);
        hockeyPlayer.setAssists(10);
        System.out.println("Expected: 10");
        System.out.println("Actual: " + hockeyPlayer.getAssists());
        System.out.println();

        // Test Unit: getPoints() : int
        System.out.println("getPoints() : int");
        // Test #1 - Returns the correct number of points.
        System.out.println("Test #1 - Returns the correct number of points.");
        hockeyPlayer = new HockeyPlayer("John Smith", 8, 5, 7);
        System.out.println("Expected: 12");
        System.out.println("Actual: " + hockeyPlayer.getPoints());
        System.out.println();

        // Test Unit: toString() : String
        System.out.println("toString() : String");
        // Test #1 - Returns the correct String representation.
        System.out.println("Test #1 - Returns the correct String representation.");
        hockeyPlayer = new HockeyPlayer("John Snow", 8, 5, 7);
        System.out.println("Expected: Hockey Player - John Snow [8], Points: 12");
        System.out.println("Actual: " + hockeyPlayer);
        System.out.println();
    }
}
