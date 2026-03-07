package module4;
//program10
public class staticblock {
    static{
        System.out.println(" It is executed earlier than Main method");
        System.out.println("waiting for  execution of main method....");
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("addition value is:"+(a+b));
    }
}