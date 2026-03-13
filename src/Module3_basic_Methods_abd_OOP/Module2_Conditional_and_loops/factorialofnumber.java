package Module2_Conditional_and_loops;

import java.util.Scanner;

public class factorialofnumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            //fact*=i;
        }
        System.out.println("day2.factorial:"+fact);
    }
}
