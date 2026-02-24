import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class palindromCheckerapp {
    public static boolean isPalindrome(String input) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Preprocess: remove spaces and convert to lowercase
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        // Enqueue characters to queue and push to stack
        for (char ch : cleanInput.toCharArray()) {
            queue.add(ch);  // FIFO
            stack.push(ch); // LIFO
        }

        // Compare dequeue (queue) vs pop (stack)
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                return false; // Mismatch found
            }
        }

        return true; // All characters matched
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Queue + Stack Based Palindrome Checker ===");
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
