package Module1_Basics_and__operations;
import java.util.Scanner;
public class Celsiustofarenheit
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in celsius:");//Input temperature in celsius
        double celsius=sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;// convert celsius to farenheit

        // Direct output without any if-else
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        sc.close();

    }
}
