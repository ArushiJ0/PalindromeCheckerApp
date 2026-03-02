
import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";
        System.out.println("Input :" + input );
        LinkedList<Character> list = new LinkedList<>();
        for (char c : input.toCharArray()) {
            list.addLast(c);
            }
            boolean isPalindrome = true;

          while(list.size()>1){
              if (list.removeFirst() != list.removeLast()) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("Is Palindrome? : " + isPalindrome);
        }
    }















