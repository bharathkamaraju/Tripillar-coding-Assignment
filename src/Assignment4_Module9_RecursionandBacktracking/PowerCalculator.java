package Assignment4_Module9_RecursionandBacktracking;
public class PowerCalculator {
    public static void main(String[] args) {
        int base = 100;
        int exponent = 9;

        long result = power(base, exponent);

        System.out.println(base + " ^ " + exponent + " = " + result);
    }

    public static long power(int a, int b) {
        // Base Case: Any number to the power of 0 is 1
        if (b == 0) {
            return 1;
        }

        // Recursive Step: a * a^(b-1)
        return a * power(a, b - 1);
    }
}