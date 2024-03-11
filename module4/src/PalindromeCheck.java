import java.util.Scanner;

public class PalindromeCheck
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a sentence ");

        String sentence = scan.nextLine();
        String sentenceonlyLetter = "";
        boolean isPalindrome = true;

        for(int i = 0; i < sentence.length(); i++)
        {
            if(Character.isLetter(sentence.charAt(i)))
            {
                sentenceonlyLetter += String.valueOf(sentence.charAt(i));
            }
        }
        int length =sentenceonlyLetter.length();
        for(int i = 0; i <length; i++)
        {
            if (sentenceonlyLetter.charAt(i) != sentenceonlyLetter.charAt(length - i - 1))
            {
                isPalindrome = false;
            }
        }

        if(isPalindrome)
        {
            System.out.print("The sentence is a palindrome");
        }
        else
        {
            System.out.print("The sentence is not a palindrome");
        }
    }

}