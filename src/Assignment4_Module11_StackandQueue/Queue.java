package Assignment4_Module11_StackandQueue;


class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // Constructor
    public ArrayQueue(int size) {
        this.capacity = size;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.count = 0; // Tracks current number of elements
    }

    // Add an element to the end - O(1)
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot add " + item);
            return;
        }
        // Move rear circularly and add item
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        count++;
        System.out.println("Enqueued: " + item);
    }

    // Remove an element from the front - O(1)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Nothing to remove.");
            return -1;
        }
        int item = queue[front];
        // Move front circularly
        front = (front + 1) % capacity;
        count--;
        return item;
    }

    // Get the front element without removing it - O(1)
    public int peek() {
        if (isEmpty()) return -1;
        return queue[front];
    }

    public boolean isFull() {
        return (count == capacity);
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < count; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

public class Queue {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display(); // 10 20 30

        System.out.println("Dequeued: " + q.dequeue()); // Removes 10
        q.display(); // 20 30

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // Queue is now: 20 30 40 50 60
        q.display();
    }
}