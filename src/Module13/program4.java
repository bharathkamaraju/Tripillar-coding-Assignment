
package Module13;
public class program4 {
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Insert a new node into BST
    static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    // Inorder traversal (sorted order)
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Find minimum node (used in deletion)
    static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Delete a node from BST
    static Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Node found
            if (root.left == null && root.right == null) {
                return null; // Case 1: No child
            } else if (root.left == null) {
                return root.right; // Case 2: One child (right)
            } else if (root.right == null) {
                return root.left; // Case 2: One child (left)
            } else {
                // Case 3: Two children
                Node minNode = findMin(root.right);
                root.data = minNode.data;
                root.right = delete(root.right, minNode.data);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = null;

        // Example input values
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        // Build BST
        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Inorder traversal before deletion: ");
        inorder(root);
        System.out.println();

        // Delete node 20 (leaf), 30 (one child), 50 (two children)
        root = delete(root, 20);
        root = delete(root, 30);
        root = delete(root, 50);

        System.out.print("Inorder traversal after deletion: ");
        inorder(root);
        System.out.println();
    }
}