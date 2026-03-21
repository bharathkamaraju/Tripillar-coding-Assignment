package Assignment4_Module9_RecursionandBacktracking;

public class RecursionExample {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Printing from " + n + " to 1:");
        printDescending(n);
    }

    public static void printDescending(int n) {
        // Base Case: Stop when n is 0
        if (n <= 0) {
            return;
        }

        // 1. Action: Print the current number
        System.out.print(n + " ");

        // 2. Recursive Step: Call the function with n - 1
        printDescending(n - 1);
    }
}