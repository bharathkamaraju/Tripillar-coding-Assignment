package module4;
//program9
/*final class finalclass {
    void display() {
        System.out.println("Final class Example");
    }
}*/
//class Inherit extends FinalClassEx{
//}
// Final class cannot be inherited
final class Animal {
    void display() {
        System.out.println("This is a final class.");
    }
}
public class finalclass {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.display();
    }
}