package module5;
//program3

public class Ageexample {
    public static void main(String[] args) {
        access(17);
    }
    static void access(int age){
        if(age>=18){
            System.out.println("Permission Granted");
        }else {
            throw new RuntimeException("Access denied");
        }
    }
}
