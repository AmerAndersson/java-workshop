package algoritm;
/*
 * In Binary Tree, Inorder successor of a node is the next node
 * in Inorder traversal of the Binary Tree. Inorder Successor is NULL
 * for the last node in Inorder traversal. In Binary Search Tree, 
 * Inorder Successor of an input node can also be defined as the 
 * node with the smallest key greater than the key of the input node. 
 * So, it is sometimes important to find next node in sorted order.
 * 
 * 
 --------------------------------------------------------------
 Inorder Successor in BST
 Method 1 (Uses Parent Pointer) 

In this method, we assume that every node has a parent pointer. 
The Algorithm is divided into two cases on the basis of the right subtree of the input node being empty or not.
Input: node, root // node is the node whose Inorder successor is needed. 
Output: succ // succ is Inorder successor of node.
 
1. If right subtree of node is not NULL, then succ lies in right subtree. Do the following. 
* Go to right subtree and return the node with minimum key value in the right subtree.
2. If right subtree of node is NULL, then succ is one of the ancestors. Do the following. 
* Travel up using the parent pointer until you see a node which is left child of its parent.
* The parent of such a node is the succ.

* Implementation: 
* Note that the function to find InOrder Successor is highlighted (with gray background) in below code.  
*/

// inorder successor of 8 is 10, 
// inorder successor of 10 is 12 
// inorder successor of 14 is 20.
// Java program to find minimum
// value node in Binary Search Tree
// A binary tree node
public class Node {
    public int data;
    public Node left;
    public Node right;
    Node parent;

    Node(int d) {
        data = d;
        left = right = parent = null;
    }

}
