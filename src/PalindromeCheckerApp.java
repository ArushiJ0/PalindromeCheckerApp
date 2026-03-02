import java.util.*;
public class PalindromeCheckerApp {
    static class PalindromeChecker {
        public boolean checkPalindrome(String input) {
            int start = 0;
            int end = input.length() - 1;
            while (start < end) {
                if (input.charAt(start) != input.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }

    public static void main(String[] args) {

        String input = "racecar";
        System.out.println("Input: " + input);

        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);

        System.out.println("Is Palindrome? : " + result);
    }

}