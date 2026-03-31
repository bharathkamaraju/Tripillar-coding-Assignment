package Module12;
public class program3 {
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Method to perform postorder traversal
    static void postorder(Node root) {
        if (root == null) {
            return;
        }
        // Traverse left subtree
        postorder(root.left);
        // Traverse right subtree
        postorder(root.right);
        // Visit root node
        System.out.print(root.data + " ");
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

        // Perform postorder traversal
        System.out.println("Postorder traversal of the binary tree:");
        postorder(root);
    }
}