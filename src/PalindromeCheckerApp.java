import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Input :");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
            if(input.equals(reversed)){
                System.out.println(input+ " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }

        }

    }
