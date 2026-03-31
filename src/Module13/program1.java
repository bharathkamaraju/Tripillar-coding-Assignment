
package Module13;

import java.util.Scanner;


// Node class representing each node in the BST
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class program1 {
    Node root;

    // Method to insert a new element into the BST
    Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    // Inorder traversal to display elements in sorted order
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        program1 bst = new program1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements to insert:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            bst.root = bst.insert(bst.root, value);
        }

        System.out.println("Inorder traversal of BST:");
        bst.inorder(bst.root);

        sc.close();
    }
}
