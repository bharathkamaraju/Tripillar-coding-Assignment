

package Module13;

public class program5 {
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Function to check if tree is BST
    static boolean isBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    // Utility function with min/max constraints
    static boolean isBSTUtil(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.data <= min || node.data >= max) {
            return false;
        }
        return isBSTUtil(node.left, min, node.data) &&
                isBSTUtil(node.right, node.data, max);
    }

    // Driver code
    public static void main(String[] args) {
        // Example 1: Valid BST
        Node root1 = new Node(10);
        root1.left = new Node(5);
        root1.right = new Node(20);
        root1.left.left = new Node(2);
        root1.left.right = new Node(8);

        System.out.println("Tree 1 is a valid BST? " + isBST(root1));

        // Example 2: Invalid BST
        Node root2 = new Node(10);
        root2.left = new Node(15); // violates BST property
        root2.right = new Node(20);

        System.out.println("Tree 2 is a valid BST? " + isBST(root2));
    }
}
