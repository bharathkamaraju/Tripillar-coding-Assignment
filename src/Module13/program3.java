
package Module13;

import java.util.*;

public class program3 {
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

    // Find minimum element in BST
    static int findMin(Node root) {
        if (root == null) {
            throw new NoSuchElementException("Tree is empty");
        }
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    // Find maximum element in BST
    static int findMax(Node root) {
        if (root == null) {
            throw new NoSuchElementException("Tree is empty");
        }
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    public static void main(String[] args) {
        Node root = null;

        // Example input values
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        // Build BST
        for (int val : values) {
            root = insert(root, val);
        }

        // Display min and max
        System.out.println("Minimum element in BST: " + findMin(root));
        System.out.println("Maximum element in BST: " + findMax(root));
    }
}