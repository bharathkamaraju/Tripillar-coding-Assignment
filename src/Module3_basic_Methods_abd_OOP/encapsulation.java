package Module3_basic_Methods_abd_OOP;
import java.util.Scanner;
public class encapsulation
{
    private String name;

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }
    public static void main(String[] args) {

        encapsulation s = new encapsulation();
        s.setName("Bharath");

        System.out.println("Name: " + s.getName());
    }
    
}
