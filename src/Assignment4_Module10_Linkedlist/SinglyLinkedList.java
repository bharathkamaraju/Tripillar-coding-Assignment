package Assignment4_Module10_Linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    // The starting point of the list
    Node head = null;

    // Method to add a new node at the end
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            // Traverse to the end of the list
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to display all elements
    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        System.out.print("Nodes of singly linked list: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Adding elements
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        // Displaying elements
        list.display();
    }
}