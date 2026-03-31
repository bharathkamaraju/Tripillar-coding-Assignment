package Module12;

public class program1 {
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Inorder traversal: Left -> Root -> Right
    static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);   // Visit left subtree
            System.out.print(root.data + " "); // Visit root
            inorderTraversal(root.right);  // Visit right subtree
        }
    }

    public static void main(String[] args) {
        // Create the binary tree
        /*
                 1
                / \
               2   3
              / \
             4   5
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Perform inorder traversal
        System.out.println("Inorder Traversal of the Binary Tree:");
        inorderTraversal(root);
    }
}