package Module3_basic_Methods_abd_OOP;

public class program2
{
    public static void checkNumber(int num){
        if(num>0){
            System.out.println(num+" is Positive");
        }else if(num<0){
            System.out.println(num+" is Negative");
        }else{
            System.out.println(num+" is Zero");
        }
    }
    public static void main(String[] args){
        checkNumber(10);
        checkNumber(-5);
        checkNumber(0);
    }
}
