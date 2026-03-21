package Assignment4_Module10_Linkedlist;

// Using bNode to avoid duplicate class errors
class CNode {
    int data;
    CNode next;

    CNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CountNodes {
    private bNode head = null;

    // 1. Insert at the Beginning - O(1)
    public void insertAtBeginning(int data) {
        bNode newNode = new bNode(data);
        newNode.next = head;
        head = newNode;
    }

    // 2. Insert at the End - O(n)
    public void insertAtEnd(int data) {
        bNode newNode = new bNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        bNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 3. Delete a Node by Value - O(n)
    public void deleteByValue(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        bNode current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // 4. Count the Number of Nodes - O(n)
    public int countNodes() {
        int count = 0;
        bNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // 5. Display the List
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        bNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CountNodes list = new CountNodes();

        // Adding elements
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.insertAtEnd(30);

        // Display and Count
        list.display();
        System.out.println("Total Nodes: " + list.countNodes());

        // Delete and check again
        list.deleteByValue(20);
        list.display();
        System.out.println("Total Nodes after deletion: " + list.countNodes());
    }
}