package Module3_basic_Methods_abd_OOP;

public class program5
{
    String Name;
    //Constructor
    program5(String Name){
        this.Name=Name;
    }
    void display()
    {
        System.out.println(Name);
    }
    public static void main(String[] args){
        program5 ob=new program5("Bharath");
        ob.display();
    }

}
