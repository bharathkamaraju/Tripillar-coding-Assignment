

package Module13;
public class program2 {
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Function to insert a new node in BST
    static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    // Function to search for a key in BST
    static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // Driver code
    public static void main(String[] args) {
        Node root = null;
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        // Insert values into BST
        for (int val : values) {
            root = insert(root, val);
        }

        // Keys to search
        int key1 = 40;
        int key2 = 25;

        // Search results
        System.out.println("Searching for " + key1 + ": " + (search(root, key1) ? "Found" : "Not Found"));
        System.out.println("Searching for " + key2 + ": " + (search(root, key2) ? "Found" : "Not Found"));
    }
}
