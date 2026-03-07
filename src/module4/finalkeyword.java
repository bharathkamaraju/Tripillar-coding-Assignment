package module4;
//program5

public class finalkeyword {
    public static void main(String[] args) {
        final int x=5;
        System.out.println("initial value :"+x);
        System.out.println("x remains constant: "+x);
        final StringBuilder s=new StringBuilder("hello");
        System.out.println("initial message:"+s);
        s.append("Bharath");
        System.out.println("modified message"+s);
    }
}
// we cannot declare value of x two times if it is final