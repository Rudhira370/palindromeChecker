import java.util.Scanner;
import java.util.Stack;

public class palindromCheckerapp {
    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase(); // Ignore spaces and case

        // Push each character into the stack
        for (char ch : cleanInput.toCharArray()) {
            stack.push(ch);
        }

        // Pop characters from the stack and compare with original
        for (char ch : cleanInput.toCharArray()) {
            if (ch != stack.pop()) {
                return false; // Mismatch found, not a palindrome
            }
        }

        return true; // All characters matched
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Stack-Based Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("\"" + input + "\" is a palindrome!");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}