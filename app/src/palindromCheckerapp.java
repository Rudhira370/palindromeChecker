public class palindromCheckerapp {
    public static void main(String[] args) {

        // Hardcoded string literal
        String word = "madam";

        // Reverse the string
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }

        // Conditional check for palindrome
        if (word.equals(reversedWord)) {
            System.out.println("The given word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The given word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program execution completed.");
    }
}
}
