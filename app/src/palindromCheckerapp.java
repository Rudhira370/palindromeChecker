public class palindromCheckerapp {
    public static boolean isPalindrome(String str) {
            // Convert string to char array
                char[] chars = str.toCharArray();

                int start = 0;
            int end = chars.length - 1;

            // Two-pointer comparison
            while (start < end) {
                if (chars[start] != chars[end]) {
                    return false; // Not a palindrome
                }
                start++;
                end--;
            }
            return true; // Palindrome
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string to check palindrome: ");
            String input = scanner.nextLine();

            if (isPalindrome(input)) {
                System.out.println("\"" + input + "\" is a palindrome!");
            } else {
                System.out.println("\"" + input + "\" is not a palindrome!");
            }

            scanner.close();
        }
    }

}