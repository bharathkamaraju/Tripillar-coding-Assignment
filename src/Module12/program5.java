
package Module12;

public class program5 {

    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Method to count nodes in the tree
    static int countNodes(Node root) {
        if (root == null) {
            return 0; // Empty tree has 0 nodes
        }
        // Count = 1 (for current node) + nodes in left subtree + nodes in right subtree
        return 1 + countNodes(root.left) + countNodes(root.right);
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

        // Calculate and print number of nodes
        System.out.println("Number of nodes in the binary tree is: " + countNodes(root));
    }
}
