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

        while (true) {
            // get the length
            int length = -1;
            while (true) {
                System.out.print("Enter the length of the room: ");
                length = scanner.nextInt();
                if (length >= 0) {
                    break;
                }
            }
            if (length == 0) {
                break;
            }
            // get the width
            int width = -1;
            while (true) {
                System.out.print("Enter the width of the room: ");
                width = scanner.nextInt();
                if (width >= 0) {
                    break;
                }
            }
            if (width == 0) {
                width = length;
            }

            // calculate the area of the room
            System.out.println("The area of the room is " + calculateRoomArea(length, width) + ".");
            System.out.println();
        }
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
