public class UseCase2PalindromeChecker {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     Palindrome Checker App      ");
        System.out.println("            UC9 Version          ");
        System.out.println("=================================");

        String original = "madam";

        if (isPalindromeRecursive(original, 0, original.length() - 1)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }

    // Recursive palindrome check
    public static boolean isPalindromeRecursive(String str, int start, int end) {

        // Base condition: crossed pointers or single character
        if (start >= end) {
            return true;
        }

        // If characters mismatch
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call reducing problem size
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}