import java.util.*;
    public class PalindromeCheckerApp {
        static boolean twoPointer(String input) {
            int start = 0, end = input.length() - 1;
            while (start < end) {
                if (input.charAt(start) != input.charAt(end))
                    return false;
                start++;
                end--;
            }
            return true;
        }
        static boolean stackMethod(String input) {
            Stack<Character> stack = new Stack<>();
            for (char c : input.toCharArray())
                stack.push(c);

            for (char c : input.toCharArray())
                if (c != stack.pop())
                    return false;

            return true;
        }
        static boolean dequeMethod(String input) {
            Deque<Character> deque = new ArrayDeque<>();
            for (char c : input.toCharArray())
                deque.addLast(c);

            while (deque.size() > 1)
                if (deque.removeFirst() != deque.removeLast())
                    return false;

            return true;
        }

        static void measure(String name, String input) {
            long startTime = System.nanoTime();

            boolean result = false;
            if (name.equals("TwoPointer"))
                result = twoPointer(input);
            else if (name.equals("Stack"))
                result = stackMethod(input);
            else if (name.equals("Deque"))
                result = dequeMethod(input);

            long endTime = System.nanoTime();

            System.out.println(name + " -> Result: " + result +
                    ", Time: " + (endTime - startTime) + " ns");
        }

        public static void main(String[] args) {

            String input = "racecar";
            System.out.println("Input: " + input);

            measure("TwoPointer", input);
            measure("Stack", input);
            measure("Deque", input);
        }
    }