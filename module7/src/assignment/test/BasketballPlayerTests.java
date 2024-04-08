package assignment.test;

public class BasketballPlayerTests {
    public static void main(String[] args) {
        // Test Unit: BasketballPlayer(String, int)
        System.out.println("BasketballPlayer(String, int)");
        // Test #1 - Initialize the name.
        System.out.println("Test #1 - Initialize the name.");
        BasketballPlayer basketballPlayer = new BasketballPlayer("John Smith", 8);
        System.out.println("Expected: John Smith");
        System.out.println("Actual: " + basketballPlayer.getName());
        System.out.println();

        // Test #2 - Initialize the number.
        System.out.println("Test #2 - Initialize the number.");
        System.out.println("Expected: 8");
        System.out.println("Actual: " + basketballPlayer.getNumber());
        System.out.println();

        // Test #3 - Initialize the free throws.
        System.out.println("Test #3 - Initialize the free throws.");
        basketballPlayer = new BasketballPlayer("John Smith", 8);
        System.out.println("Expected: 0");
        System.out.println("Actual: " + basketballPlayer.getFreeThrows());
        System.out.println();

        // Test #4 - Initialize the field goals.
        System.out.println("Test #4 - Initialize the field goals.");
        basketballPlayer = new BasketballPlayer("John Smith", 8);
        System.out.println("Expected: 0");
        System.out.println("Actual: " + basketballPlayer.getFieldGoals());
        System.out.println();

        // Test #5 - Initialize the three pointers.
        System.out.println("Test #4 - Initialize the three pointers.");
        basketballPlayer = new BasketballPlayer("John Smith", 8);
        System.out.println("Expected: 0");
        System.out.println("Actual: " + basketballPlayer.getThreePointers());
        System.out.println();

        // Test Unit: setName(String) : void
        System.out.println("setName(String) : void");
        // Test #1 - Updates the state of name.
        System.out.println("Test #1 - Updates the state of name.");
        basketballPlayer = new BasketballPlayer("John Smith", 8);
        basketballPlayer.setName("John Snow");
        System.out.println("Expected: John Snow");
        System.out.println("Actual: " + basketballPlayer.getName());
        System.out.println();

        // Test Unit: setNumber(int) : void
        System.out.println("setNumber(int) : void");
        // Test #1 - Updates the state of number.
        System.out.println("Test #1 - Updates the state of number.");
        basketballPlayer = new BasketballPlayer("John Smith", 8);
        basketballPlayer.setNumber(10);
        System.out.println("Expected: 10");
        System.out.println("Actual: " + basketballPlayer.getNumber());
        System.out.println();

        // Test Unit: setFreeThrows(int) : void
        System.out.println("setFreeThrows(int) : void");
        // Test #1 - Updates the state of free throws.
        System.out.println("Test #1 - Updates the state of free throws.");
        basketballPlayer = new BasketballPlayer("John Smith", 8);
        basketballPlayer.setFreeThrows(10);
        System.out.println("Expected: 10");
        System.out.println("Actual: " + basketballPlayer.getFreeThrows());
        System.out.println();

        // Test Unit: setFieldGoals(int) : void
        System.out.println("setFieldGoals(int) : void");
        // Test #1 - Updates the state of field goals.
        System.out.println("Test #1 - Updates the state of field goals.");
        basketballPlayer = new BasketballPlayer("John Smith", 8);
        basketballPlayer.setFieldGoals(7);
        System.out.println("Expected: 7");
        System.out.println("Actual: " + basketballPlayer.getFieldGoals());
        System.out.println();

        // Test Unit: setThreePointers(int) : void
        System.out.println("setThreePointers(int) : void");
        // Test #1 - Updates the state of three pointers.
        System.out.println("Test #1 - Updates the state of three pointers.");
        basketballPlayer = new BasketballPlayer("John Smith", 8);
        basketballPlayer.setThreePointers(9);
        System.out.println("Expected: 9");
        System.out.println("Actual: " + basketballPlayer.getThreePointers());
        System.out.println();

        // Test Unit: getPoints() : int
        System.out.println("getPoints() : int");
        // Test #1 - Updates the state of three pointers.
        System.out.println("Test #1 - Updates the state of three pointers.");
        basketballPlayer = new BasketballPlayer("John Smith", 8);
        basketballPlayer.setFreeThrows(8);
        basketballPlayer.setFieldGoals(5);
        basketballPlayer.setThreePointers(7);
        System.out.println("Expected: 39");
        System.out.println("Actual: " + basketballPlayer.getPoints());
        System.out.println();

        // Test Unit: toString() : String
        System.out.println("toString() : String");
        // Test #1 - Returns the correct String representation.
        System.out.println("Test #1 - Returns the correct String representation.");
        basketballPlayer = new BasketballPlayer("John Snow", 8);
        basketballPlayer.setFreeThrows(8);
        basketballPlayer.setFieldGoals(5);
        basketballPlayer.setThreePointers(7);
        System.out.println("Expected: Basketball Player: John Snow [8], Points: 39");
        System.out.println("Actual: " + basketballPlayer);
        System.out.println();
    }
}
