public class UseCase2PalindromeChecker {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     Palindrome Checker App      ");
        System.out.println("      UC13 Performance Test      ");
        System.out.println("=================================");

        String input = "A man a plan a canal panama";

        // Strategy 1: Stack
        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeChecker stackChecker = new PalindromeChecker(stackStrategy);

        long startTime = System.nanoTime();
        boolean stackResult = stackChecker.check(input);
        long endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        // Strategy 2: Deque
        PalindromeStrategy dequeStrategy = new DequeStrategy();
        PalindromeChecker dequeChecker = new PalindromeChecker(dequeStrategy);

        startTime = System.nanoTime();
        boolean dequeResult = dequeChecker.check(input);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        // Display results
        System.out.println("Input String: \"" + input + "\"");
        System.out.println("---------------------------------");
        System.out.println("Stack Strategy Result : " + stackResult);
        System.out.println("Stack Strategy Time   : " + stackTime + " ns");
        System.out.println("---------------------------------");
        System.out.println("Deque Strategy Result : " + dequeResult);
        System.out.println("Deque Strategy Time   : " + dequeTime + " ns");
        System.out.println("---------------------------------");

        if (stackTime < dequeTime) {
            System.out.println("Stack strategy is faster.");
        } else if (dequeTime < stackTime) {
            System.out.println("Deque strategy is faster.");
        } else {
            System.out.println("Both strategies have similar performance.");
        }
    }
}