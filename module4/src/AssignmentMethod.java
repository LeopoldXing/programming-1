import java.util.Scanner;

/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Feb 12, 2024
 * Updated: Feb 25, 2024
 */
public class AssignmentMethod {

    /**
     * Description: Main function and program entrance of the assignment_method
     *
     * @param args
     */
    public static void main(String[] args) {
        getDimension();
    }

    /**
     * Prompt and accept a dimension value entered by the user using the keyboard
     */
    private static void getDimension() {
        Scanner scanner = new Scanner(System.in);

        int length = -1;
        int width = -1;

        do {
            // get the length
            do {
                System.out.print("Enter the length of the room: ");
                length = scanner.nextInt();
            } while (length < 0);

            if (length != 0) {
                // get the width
                do {
                    System.out.print("Enter the width of the room: ");
                    width = scanner.nextInt();
                } while (width < 0);
                if (width == 0) {
                    width = length;
                }

                // calculate the area of the room
                System.out.println("The area of the room is " + calculateRoomArea(length, width) + ".");
                System.out.println();
            }
        } while (length != 0);
    }

    /**
     * Calculate the area of the room in feet
     *
     * @param length the length of the room
     * @param width  the width of the room
     * @return the area of the room
     */
    private static int calculateRoomArea(int length, int width) {
        return length * width;
    }
}
