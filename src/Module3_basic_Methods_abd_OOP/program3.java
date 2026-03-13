package Module3_basic_Methods_abd_OOP;

public class program3
{
    String name;
    int marks;

    program3(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }

    public static void main(String[] args) {

        program3 s1 = new program3("Bharath", 88);

        s1.displayDetails();
    }
}
