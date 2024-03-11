import java.util.Scanner;

public class RoomArea {

    public static void main(String[] args) {
        getDimension();
        String sentence = "";
        String sentenceOnlyLetter="";
        boolean isPalindrome = true;
        for (int i = 0; i < sentence.length(); i++) {
            if(Character.isLetter(sentence.charAt(i))) {
                sentenceOnlyLetter += String.valueOf(sentence.charAt(i));
            }
        }
        int length = sentenceOnlyLetter.length();
        for (int i = 0; i < length; i++) {
            if(sentenceOnlyLetter.charAt(i) != sentenceOnlyLetter.charAt(length - i - 1)) {
                isPalindrome = false;
            }
        }

        if(isPalindrome) {
            System.out.println();
        }else {

        }
    }

    private static void getDimension() {
        Scanner scanner = new Scanner(System.in);
        int length = -1;

        while (length != 0) {
            System.out.print("Enter the length of the room: ");
            length = scanner.nextInt();

            int width = -1;
            if (length != 0) {
                while (width < 0) {
                    System.out.print("Enter the width of the room (0 to use length as width): ");
                    width = scanner.nextInt();

                    if (width < 0) {
                        System.out.println("Width cannot be negative. Please enter a non-negative value.");
                    }
                }

                if (width == 0) {
                    width = length;
                }

                System.out.println("The area of the room is " + calculateRoomArea(length, width) + ".");
                System.out.println();
            }
        }
        scanner.close();
    }

    private static int calculateRoomArea(int length, int width) {
        return length * width;
    }
}
