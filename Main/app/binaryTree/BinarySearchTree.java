package binaryTree;

/*
 * Algorithm to search for a key in a given Binary Search Tree:
 * Let’s say we want to search for the number X, We start at the root. Then:
 * We compare the value to be searched with the value of the root.
 * If it’s equal we are done with the search if it’s smaller we know that we
 * need to go to the left subtree because in a binary search tree all the
 * elements in the left subtree are smaller and all the elements in the right
 * subtree are larger. Repeat the above step till no more traversal is possible
 * If at any iteration, key is found, return True. Else False.
 * Java program to search a given key in a given BST
 */

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;

    }

}

public class BinarySearchTree {
    public Node root;

    // Constructor
    public BinarySearchTree() {
        root = null;
    }

    // A utility function to insert
    // a new node with given key in BST
    public Node insert(Node node, int key) {
        // If the tree is empty, return a new node
        if (node == null) {
            node = new Node(key);
            return node;
        }
        // Otherwise, recur down the tree
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        }
        // Return the (unchanged) node pointer
        return node;

    }

    // Utility function to search a key in a BST
    public Node search(Node root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null || root.key == key) {
            return root;
        }
        // Key is greater than root's key
        if (root.key < key) {
            return search(root.right, key);
        } else {
            // Key is smaller than root's key
            return search(root.left, key);
        }

    }

}