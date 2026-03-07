package module4;
//program8

public class Differentstrings {
    public static void main(String[] args) {
        String s="Bharath";
        System.out.println("String before Modification :"+s);
        s.concat("Ben 10");
        System.out.println("String After Modification :"+s);
        StringBuilder builder =new StringBuilder("Bharath");
        System.out.println("StringBuilder before Modification :"+builder);
        builder.append(" Ben 10");
        System.out.println("StringBuilder After Modification :"+builder);
        StringBuffer buffer=new StringBuffer("Bharath");
        System.out.println("StringBuffer before Modification :"+buffer);
        buffer.append(" Ben 10");
        System.out.println("StringBuffer After Modification :"+buffer);
    }
}
//String cannot be modified whereas StringBuilder and StringBuffer can be modified
