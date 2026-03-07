package module4;
//program6
public class Staticprogram {
    static String college="Sapthagiri";
    int usn;
    String name;

    public Staticprogram(int usn, String name) {
        this.usn = usn;
        this.name = name;
    }
}
class StaticMethod{
    public static int add(int a,int b){
        return a+b;
    }
}
class StudentDetails extends Staticprogram{
    int attendance;
    public StudentDetails(int usn, String name,int attendance) {
        super(usn, name);
        this.attendance=attendance;
    }
    void display(){
        System.out.println(name+" "+usn+" "+attendance+" "+Staticprogram.college);
    }

    public static void main(String[] args) {
        StudentDetails s=new StudentDetails(4,"Bharath",80);
        s.display();
        //Static method Example : we can use without creating object
        System.out.println(StaticMethod.add(5,4));
    }
}
