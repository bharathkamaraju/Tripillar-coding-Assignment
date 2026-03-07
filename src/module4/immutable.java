package module4;
//program3

public class immutable {
    public static void main(String[] args) {
        String s1="hello";
        System.out.println("string before modification :"+s1);
        System.out.println("string before modification :"+s1.hashCode());
        s1.concat("World");
        System.out.println("string after modification :"+s1);
        System.out.println("string before modification :"+s1.hashCode());
    }
}
// since string before modification and after modification are same Strings are immutabe
