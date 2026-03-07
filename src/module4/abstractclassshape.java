package module4;
//program1

abstract class abstractclassshape  {
    abstract void display();
}
class Circle extends abstractclassshape {
    @Override
    void display(){
        System.out.println("Tripillar coding assignment");
    }
    public static void main(String[] args) {
        abstractclassshape  c=new Circle();
        c.display();
    }
}
