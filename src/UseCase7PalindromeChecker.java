import java.util.Deque;
import java.util.LinkedList;

public class UseCase7PalindromeChecker {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     Palindrome Checker App      ");
        System.out.println("            UC7 Version          ");
        System.out.println("=================================");

        String original = "level";

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < original.length(); i++) {
            deque.addLast(original.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear characters
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}