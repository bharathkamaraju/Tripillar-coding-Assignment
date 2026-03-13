package Module9;
public class FibonacciSeries {
    public static void main(String[] args) {
        int n=7;
        System.out.println("Fibonacci Series of :"+n+" terms is");
        for (int i = 0; i <=n; i++) {
            System.out.print(fibo(i)+" ");
        }
    }
    public static int fibo(int n){
        if(n==0||n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}