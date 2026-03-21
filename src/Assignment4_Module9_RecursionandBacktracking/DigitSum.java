package Assignment4_Module9_RecursionandBacktracking;
public class DigitSum {
    public static void main(String[] args) {
        int number = 12345;
        int result = sumOfDigits(number);

        System.out.println("The sum of digits of " + number + " is: " + result);
    }

    public static int sumOfDigits(int n) {
        // Base Case: If n is 0, we've processed all digits
        if (n == 0) {
            return 0;
        }

        // Recursive Step: Last digit + sum of remaining digits
        return (n % 10) + sumOfDigits(n / 10);
    }
}