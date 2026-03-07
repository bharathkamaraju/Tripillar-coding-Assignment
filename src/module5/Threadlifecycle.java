package module5;
//program9

public class Threadlifecycle extends Thread{
    public void run(){
        try{
            System.out.println("thread is running");
            Thread.sleep(1000);
            System.out.println("thread finished running");
        }catch(Exception e){
            System.out.println("ERROR!");
        }
    }
}
class ThreadLifeDemo{
    public static void main(String[] args) throws Exception{
        Threadlifecycle tl=new Threadlifecycle();
        System.out.println("state:"+tl.getState());
        tl.start();
        System.out.println("state after start :"+tl.getState());
        Thread.sleep(500);
        System.out.println("state while sleeping :" +tl.getState());
        tl.join();
        System.out.println("state after completion :"+tl.getState());
    }
}