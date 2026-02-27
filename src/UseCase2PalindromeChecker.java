import java.util.Deque;
import java.util.LinkedList;

public class UseCase2PalindromeChecker {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     Palindrome Checker App      ");
        System.out.println("            UC7 Version          ");
        System.out.println("public class UseCase2PalindromeChecker {\n" +
                "\n" +
                "    // Node class for singly linked list\n" +
                "    static class Node {\n" +
                "        char data;\n" +
                "        Node next;\n" +
                "\n" +
                "        Node(char data) {\n" +
                "            this.data = data;\n" +
                "            this.next = null;\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "\n" +
                "        System.out.println(\"=================================\");\n" +
                "        System.out.println(\"     Palindrome Checker App      \");\n" +
                "        System.out.println(\"            UC8 Version          \");\n" +
                "        System.out.println(\"=================================\");\n" +
                "\n" +
                "        String original = \"level\";\n" +
                "\n" +
                "        // Convert string to linked list\n" +
                "        Node head = null;\n" +
                "        Node tail = null;\n" +
                "\n" +
                "        for (int i = 0; i < original.length(); i++) {\n" +
                "            Node newNode = new Node(original.charAt(i));\n" +
                "            if (head == null) {\n" +
                "                head = newNode;\n" +
                "                tail = newNode;\n" +
                "            } else {\n" +
                "                tail.next = newNode;\n" +
                "                tail = newNode;\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        // Check palindrome using linked list\n" +
                "        if (isPalindrome(head)) {\n" +
                "            System.out.println(original + \" is a palindrome.\");\n" +
                "        } else {\n" +
                "            System.out.println(original + \" is not a palindrome.\");\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public static boolean isPalindrome(Node head) {\n" +
                "\n" +
                "        if (head == null || head.next == null)\n" +
                "            return true;\n" +
                "\n" +
                "        // Step 1: Find middle using fast & slow pointer\n" +
                "        Node slow = head;\n" +
                "        Node fast = head;\n" +
                "\n" +
                "        while (fast.next != null && fast.next.next != null) {\n" +
                "            slow = slow.next;\n" +
                "            fast = fast.next.next;\n" +
                "        }\n" +
                "\n" +
                "        // Step 2: Reverse second half\n" +
                "        Node secondHalf = reverse(slow.next);\n" +
                "\n" +
                "        // Step 3: Compare first half and reversed second half\n" +
                "        Node firstHalf = head;\n" +
                "        Node tempSecond = secondHalf;\n" +
                "\n" +
                "        while (tempSecond != null) {\n" +
                "            if (firstHalf.data != tempSecond.data)\n" +
                "                return false;\n" +
                "\n" +
                "            firstHalf = firstHalf.next;\n" +
                "            tempSecond = tempSecond.next;\n" +
                "        }\n" +
                "\n" +
                "        return true;\n" +
                "    }\n" +
                "\n" +
                "    // Reverse linked list\n" +
                "    public static Node reverse(Node head) {\n" +
                "\n" +
                "        Node prev = null;\n" +
                "        Node current = head;\n" +
                "\n" +
                "        while (current != null) {\n" +
                "            Node nextNode = current.next;\n" +
                "            current.next = prev;\n" +
                "            prev = current;\n" +
                "            current = nextNode;\n" +
                "        }\n" +
                "\n" +
                "        return prev;\n" +
                "    }\n" +
                "}=================================");

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