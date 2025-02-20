package algoritm;

/**
 * BinaryTree
 */
public class BinaryTree {
    static Node head;

    /*
     * Given a binary search tree and a number,
     * inserts a new node with the given number in
     * the correct place in the tree. Returns the new
     * root pointer which the caller should then use
     * (the standard trick to avoid using reference
     * parameters).
     */
    public Node insert(Node node, int data) {

        // 1. If the tree is empty, return a new, single node
        if (node == null) {
            return (new Node(data));
        } else {
            Node temp = null;

            // 2. Otherwise, recur down the tree
            if (data <= node.data) {
                temp = insert(node.left, data);
                node.left = temp;
                temp.parent = node;

            } else {
                temp = insert(node.right, data);
                node.right = temp;
                temp.parent = node;

            }
            // return the (unchanged) node pointer
            return node;

        }
    }

    /**
     * @param root
     * @param n
     * @return
     */
    public Node inOrderSuccessor(Node root, Node n) {
        // step 1 of the above algorithm
        if (n.right != null) {
            return minValue(n.right);
        }

        // step 2 of the above algorithm
        Node p = n.parent;
        while (p != null && n == p.right) {
            n = p;
            p = p.parent;

        }
        return p;
    }

    /*
     * Given a non-empty binary search
     * tree, return the minimum data
     * value found in that tree. Note that
     * the entire tree does not need
     * to be searched.
     */
    Node minValue(Node node) {
        Node current = node;
        // loop down to find the leftmost leaf
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

}
