
import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "refer";
        System.out.println("Input :" + input );
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
            }
            boolean isPalindrome = true;

          while(deque.size()>1){
              if (deque.removeFirst() != deque.removeLast()) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("Is Palindrome? : " + isPalindrome);
        }
    }















