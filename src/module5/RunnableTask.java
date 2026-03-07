package module5;
//program7

public class RunnableTask implements Runnable{
    @Override
    public void run() {
        System.out.println("task is being Executed");
    }
}
class Main{
    public static void main(String[] args) {
        RunnableTask task=new RunnableTask();
        Thread thread=new Thread(task);
        thread.start();
        System.out.println("main program executing");
    }
}