package Module1_Basics_and__operations;

public class swap2numbers
{
    public static void main(String[] args) {


        int a = 10, b = 20;
        System.out.println("before swapping" + a + " " + b);

        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping"+a+" "+b);


    }
}

