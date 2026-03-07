package module5;

//program10

public class Alternatethread {
    private final int limit = 10;
    private int counter = 1;

    public void printNumbers() {
        synchronized (this) {
            while (counter <= limit) {
                // Determine if it's this thread's turn based on parity
                String threadName = Thread.currentThread().getName();

                System.out.println(threadName + ": " + counter);
                counter++;

                // Wake up the other thread
                notify();

                try {
                    // Only wait if we haven't reached the limit yet
                    if (counter <= limit) {
                        wait();
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void main(String[] args) {
        Alternatethread resource = new Alternatethread();

        Thread t1 = new Thread(resource::printNumbers, "Thread 1");
        Thread t2 = new Thread(resource::printNumbers, "Thread 2");

        t1.start();
        t2.start();
    }
}