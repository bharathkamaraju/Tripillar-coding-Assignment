package Module12;

class program2 {

    // Node structure for the binary tree
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Method to perform preorder traversal
    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        // Visit root node first
        System.out.print(root.data + " ");
        // Traverse left subtree
        preorder(root.left);
        // Traverse right subtree
        preorder(root.right);
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

        // Perform preorder traversal
        System.out.println("Preorder traversal of the binary tree:");
        preorder(root);
    }
}