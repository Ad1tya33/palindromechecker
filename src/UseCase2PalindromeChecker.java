public class UseCase2PalindromeChecker {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     Palindrome Checker App      ");
        System.out.println("            UC12 Version         ");
        System.out.println("=================================");

        String input = "Never Odd Or Even";

        // Choose strategy at runtime
        PalindromeStrategy strategy = new DequeStrategy();
        // PalindromeStrategy strategy = new StackStrategy();

        PalindromeChecker checker = new PalindromeChecker(strategy);

        if (checker.check(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}