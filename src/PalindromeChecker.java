public class PalindromeChecker {

    private PalindromeStrategy strategy;

    // Strategy Injection
    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String input) {
        return strategy.isPalindrome(input);
    }
}