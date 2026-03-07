package module4;
//program2

public interface vehicle {
    void start();
}
class Car implements vehicle{

    @Override
    public void start() {
        System.out.println("need key to start");
    }

    public static void main(String[] args) {
        Car c=new Car();
        c.start();

    }
}
