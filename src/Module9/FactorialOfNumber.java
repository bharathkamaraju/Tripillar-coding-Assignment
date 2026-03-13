package Module9;
public class FactorialOfNumber {
    public static void main(String[] args) {
        int n=5;
        int result=fact(n);
        System.out.println("Factorial of number is: "+result);
    }
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}