package module5;
//program4
public class customexceptionclass {
    public static void main(String[] args) {
        int a,b,c=0;
        a=5;
        b=0;
        String s="Bharath";
        try{
            c=a/b;
            s.charAt(9);
        }catch (Exception e){
            System.out.println("there is some invalid input");
        }
        System.out.println("the value of c is "+c);
    }
}