package Module2_Conditional_and_loops;

import java.util.Scanner;

public class primenumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isprime=true;
        if(n<=1){
            isprime=false;
        }else{
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    isprime=false;
                    break;
                }

            }
        }
        System.out.println(isprime?"prime":"composite");
    }

}
