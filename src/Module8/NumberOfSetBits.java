package Module8;
public class NumberOfSetBits {
    public static void main(String[] args) {
        int n=10;
        int count=Integer.bitCount(n);
        System.out.println("Number of setbits are : "+count);
        //manual
        int setsbits=0;
        while (n != 0) {
            n &= (n - 1); // Unsets the rightmost set bit
            setsbits++;
        }
        System.out.println("Number of setbits are : "+setsbits);
    }
}