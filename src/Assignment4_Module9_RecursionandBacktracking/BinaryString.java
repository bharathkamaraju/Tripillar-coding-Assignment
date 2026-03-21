package Assignment4_Module9_RecursionandBacktracking;

public class BinaryString {
    public static void main(String[] args) {
        int n = 3;
        char[] result = new char[n];
        System.out.println("Binary strings of length " + n + ":");
        generateBinary(n, result, 0);
    }

    public static void generateBinary(int n, char[] arr, int i) {
        // Base Case: If the current index equals n, the string is full
        if (i == n) {
            System.out.println(new String(arr));
            return;
        }
        arr[i] = '0';
        generateBinary(n, arr, i + 1);

        arr[i] = '1';
        generateBinary(n, arr, i + 1);
    }
}