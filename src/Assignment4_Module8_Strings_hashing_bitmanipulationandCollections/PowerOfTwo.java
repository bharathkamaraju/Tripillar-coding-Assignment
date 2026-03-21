package Assignment4_Module8_Strings_hashing_bitmanipulationandCollections;


public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 16;

        if (isPowerOfTwo(num)) {
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is not a power of 2.");
        }
    }

    public static boolean isPowerOfTwo(int n) {
        // A power of 2 must be greater than 0
        // (n & (n - 1)) == 0 checks if only one bit is set
        return n > 0 && (n & (n - 1)) == 0;
    }
}