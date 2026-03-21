package Assignment4_Module10_Linkedlist;
// Renamed to bNode to maintain uniqueness in the package
class bNode {
    int data;
    bNode next;

    bNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNodes {
    private bNode head = null;

    // 1. Insert at the Beginning - O(1)
    public void insertAtBeginning(int data) {
        bNode newNode = new bNode(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Inserted " + data + " at the beginning.");
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
        System.out.println("Inserted " + data + " at the end.");
    }

    // 3. Delete a Node by Value - O(n)
    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete " + value);
            return;
        }

        // If head itself holds the value to be deleted
        if (head.data == value) {
            head = head.next;
            System.out.println("Deleted " + value + " from head.");
            return;
        }

        bNode current = head;
        // Search for the node directly BEFORE the one we want to remove
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next; // Bypass the target node
            System.out.println("Deleted " + value + " from list.");
        } else {
            System.out.println("Value " + value + " not found in the list.");
        }
    }

    // 4. Display the List
    public void display() {
        if (head == null) {
            System.out.println("The list is currently empty.");
            return;
        }
        bNode current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteNodes list = new DeleteNodes();

        // Testing the operations
        list.insertAtEnd(100);
        list.insertAtEnd(200);
        list.insertAtBeginning(50);

        list.display(); // Expected: 50 -> 100 -> 200 -> null

        list.deleteByValue(100);
        list.display(); // Expected: 50 -> 200 -> null
    }
}