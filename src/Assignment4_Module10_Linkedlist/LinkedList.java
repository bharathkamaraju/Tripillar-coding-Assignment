package Assignment4_Module10_Linkedlist;

class ANode {
    int data;
    ANode next;

    // Constructor to initialize the node
    ANode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    // The head of the list, using our renamed ANode class
    private ANode head = null;

    // Method to insert a node at the end - O(n)
    public void insertAtEnd(int data) {
        ANode newNode = new ANode(data);

        // If the list is empty, the new node becomes the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Otherwise, traverse to the last node
        ANode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Link the last node to our new node
        temp.next = newNode;
    }

    // Method to display all elements
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        ANode current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements to the end
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        // Show the results
        list.display();
    }
}