import java.util.Scanner;

/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Feb 12, 2024
 * Updated: Feb 12, 2024
 */
public class Assignment614767 {

    /**
     * Description: Main function and program entrance of the assignment4, 6.14.7-No67
     *
     * @param args
     */
    public static void main(String[] args) {
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // 1st loop to create a String with only letters
        StringBuffer sentenceBuffer = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                sentenceBuffer.append(input.charAt(i));
            }
        }
        String sentence = sentenceBuffer.toString();

        // Printing result
        if (isPalindrome(sentence)) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is not a palindrome.");
        }
    }

    /**
     * Determining whether it is a palindrome
     *
     * @param: the sentence user typed in, should be all letters
     * @return: boolean value indicating whether the input String is a palindrome
     */
    private static boolean isPalindrome(String sentence) {
        if (sentence == null) return false;
        byte[] bytes = sentence.toLowerCase().getBytes();
        if (bytes.length <= 1) return true;

        // 2nd loop to determine whether it is a palindrome
        for (int i = 0, j = bytes.length - 1; i < j; i++, j--) {
            if (bytes[i] != bytes[j]) return false;
        }

        return true;
    }
}
