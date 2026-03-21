package Assignment4_Module10_Linkedlist;
class QNode {
    int data;
    QNode next;

    // Constructor to initialize a new node
    QNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListMaster {
    // The head holds the address of the first node
    Node head = null;

    // 1. Insert at the Beginning - O(1) Time Complexity
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Point new node to current head
        head = newNode;      // Make new node the new head
        System.out.println("Inserted " + data + " at the beginning.");
    }

    // 2. Insert at the End - O(n) Time Complexity
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Inserted " + data + " at the end.");
    }

    // 3. Display the List
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.print("Current List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListMaster list = new LinkedListMaster();

        // Let's build the list
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display(); // 20 -> 30 -> null

        // Now insert at the front
        list.insertAtBeginning(10);
        list.insertAtBeginning(5);

        // Final display
        list.display(); // 5 -> 10 -> 20 -> 30 -> null
    }
}