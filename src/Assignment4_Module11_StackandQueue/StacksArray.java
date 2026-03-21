package Assignment4_Module11_StackandQueue;

class ArrayStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize the stack
    public ArrayStack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // Stack is empty when top is -1
    }

    // Push an element onto the stack - O(1)
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed: " + value);
    }

    // Pop an element from the stack - O(1)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Nothing to pop.");
            return -1;
        }
        return stackArray[top--];
    }

    // Peek the top element - O(1)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

public class StacksArray{
    public static void main(String[] args) {
        ArrayStack myStack = new ArrayStack(5);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        myStack.display(); // 30 20 10

        System.out.println("Popped element: " + myStack.pop());

        System.out.println("Top element is: " + myStack.peek());

        myStack.display(); // 20 10
    }
}