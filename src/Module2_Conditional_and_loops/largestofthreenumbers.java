package Module2_Conditional_and_loops;

import java.util.Scanner;

public class largestofthreenumbers
{
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int x=sc.nextInt();

        int y=sc.nextInt();

        int z=sc.nextInt();
        if(x>y && x>z) {
            System.out.println(x + "is largest number");
        }else if(y>x && y>z) {
            System.out.println(y + "is largest number");
        }else{
            System.out.println(z+" is larget number");
        }
    }
}
