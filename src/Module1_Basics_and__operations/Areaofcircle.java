package Module1_Basics_and__operations;
import java.util.Scanner;
public class Areaofcircle
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of the circle:");
        int rad=sc.nextInt();

        float pi=3.142f;
        float area=pi*rad*rad;

        System.out.println("Area of the circle is:"+area);
    }
}
