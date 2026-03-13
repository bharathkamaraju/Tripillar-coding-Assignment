package Module3_basic_Methods_abd_OOP;

import day3.square;

import java.util.Scanner;

public class squareofnumber
{
    int Square(int n){
        return n*n;

    }
    public static void main(String[]args){
        squareofnumber ob=new squareofnumber();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(ob.Square(n));
    }
}
