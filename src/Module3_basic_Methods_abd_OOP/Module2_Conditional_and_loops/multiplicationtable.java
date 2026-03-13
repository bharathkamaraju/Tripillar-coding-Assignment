package Module2_Conditional_and_loops;
import java.util.Scanner;
public class multiplicationtable
{
    public static void main(String[] args){
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        for(int i=1; i<11; i++){
            // System.out.println(n + " x " + i + " = " + n*i);
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
    }
}
