package Assignment4_Module11_StackandQueue;
import java.util.Stack;

public class ReverseStack {

    // Helper method to insert an element at the bottom of a stack
    public static void insertAtBottom(Stack<Integer> stack, int item) {
        // Base case: if stack is empty, just push the item
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }

        // Recursive step:
        // 1. Pop the top element
        int top = stack.pop();
        // 2. Recurse to reach the bottom
        insertAtBottom(stack, item);
        // 3. Push the popped element back on top
        stack.push(top);
    }

    // Main method to reverse the stack
    public static void reverse(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // 1. Pop the top element
            int top = stack.pop();
            // 2. Reverse the remaining stack
            reverse(stack);
            // 3. Insert the popped element at the bottom
            insertAtBottom(stack, top);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack (top is right): " + stack);

        reverse(stack);

        System.out.println("Reversed Stack (top is right): " + stack);
    }
}