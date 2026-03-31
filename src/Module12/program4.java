package Module12;

public class program4 {
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Method to calculate height of the tree
    static int height(Node root) {
        if (root == null) {
            return 0; // Empty tree has height 0
        }
        // Recursively find height of left and right subtrees
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Height of tree = 1 + max(leftHeight, rightHeight)
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        // Constructing a sample binary tree
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

        // Calculate and print height
        System.out.println("Height of the binary tree is: " + height(root));
    }
}