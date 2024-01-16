import java.util.Random;

/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Jan 15, 2024
 * Updated: Jan 15, 2024
 */
public class Assignment3187_59 {

    /**
     * Description: Main function and program entrance of the assignment2, 3.18.7-No59
     *
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbers = new int[5];
        int smallestNumber = 0;

        // Generate 5 randomNumbers
        for (int i = 0; i < 5; i++) {
            randomNumbers[i] = random.nextInt(60, 101);

            // Usng Math to get the smallest Number
            if(i == 0) {
                smallestNumber = randomNumbers[0];
            } else {
                smallestNumber = Math.min(smallestNumber, randomNumbers[i]);
            }
        }

        // Display results
        System.out.println("Random numbers: "
                + randomNumbers[0] + ", "
                + randomNumbers[1] + ", "
                + randomNumbers[2] + ", "
                + randomNumbers[3] + ", "
                + randomNumbers[4]);
        System.out.println("The smallest value is " + smallestNumber + ".");
    }
}
