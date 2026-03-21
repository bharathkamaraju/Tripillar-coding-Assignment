package Assignment4_Module11_StackandQueue;

import java.util.Stack;

public class BalancedParenthesis {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Push opening brackets to stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // Process closing brackets
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false; // Closing bracket with no opener
                }

                char lastOpener = stack.pop();
                if (!isMatchingPair(lastOpener, ch)) {
                    return false; // Mismatched bracket types
                }
            }
        }

        // If stack is empty, all brackets were matched
        return stack.isEmpty();
    }

    // Helper method to check if brackets match
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        String test1 = "{[()]}";
        String test2 = "{[(])}";
        String test3 = "((()))";

        System.out.println(test1 + " is balanced: " + isBalanced(test1)); // true
        System.out.println(test2 + " is balanced: " + isBalanced(test2)); // false
        System.out.println(test3 + " is balanced: " + isBalanced(test3)); // true
    }
}