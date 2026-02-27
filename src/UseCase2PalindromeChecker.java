public class UseCase2PalindromeChecker {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     Palindrome Checker App      ");
        System.out.println("            UC10 Version         ");
        System.out.println("=================================");

        String input = "Never Odd Or Even";

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }

    // Case-insensitive & space-ignored palindrome check
    public static boolean isPalindrome(String str) {

        // Normalize string:
        // 1. Convert to lowercase
        // 2. Remove all non-alphabet characters (spaces, symbols)
        String normalized = str.toLowerCase().replaceAll("[^a-z]", "");

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}