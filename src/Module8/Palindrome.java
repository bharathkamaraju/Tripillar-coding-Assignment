package Module8;

public class Palindrome {
    public static void main(String[] args) {
        String str="malayalam";
        String rev="";
        for (int i = str.length()-1; i >=0; i--) {
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Given string is Palindrome");
        }else{
            System.out.println("Given string is not a Palindrome");
        }
    }
}