
/**
 * Each node has three data members:
 * data: The value stored in the node.
 * next: A reference to the next node.
 * prev: A reference to the previous node.
 * Creating a Doubly Linked List
 * Node class with the necessary data members:
 */
public class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    // DoublyLinkedList class that maintains references to the head and tail nodes
    public class DoublyLinkedList {
        Node head;
        Node tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

    }

    /**
     * Traversing a Doubly Linked List
     * Traversal in a doubly linked list can be done in two directions:
     * Forward traversal: Starting from the head, follow the next references until
     * the end of the list.
     * Backward traversal: Starting from the tail, follow the prev references until
     * the head of the list.
     */
    public void traverseForward(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void traverseBackward(Node tail) {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
    }

    /**
     * In the insertAfter method:
     * 
     * We create a new node with the given data.
     * Adjust the references of the new node, the previous node, and the next node.
     * Update the tail reference if necessary.
     * In the insertBefore method:
     * 
     * Similar to insertAfter, we create a new node.
     * Adjust the references of the new node, the next node, and the previous node.
     * Update the head reference if necessary.
     */
    public class DoublyLinkedLists {
        private Node head;
        private Node tail;

        // ... Other methods (constructor, traversal, etc.) ...

        // Insert a new node after a given node
        public void insertAfter(Node prevNode, int data) {
            if (prevNode == null) {
                System.out.println("Previous node cannot be null.");
                return;
            }

            Node newNode = new Node(data);
            newNode.next = prevNode.next;
            newNode.prev = prevNode;
            if (prevNode.next != null) {
                prevNode.next.prev = newNode;
            }
            prevNode.next = newNode;

            // Update tail if the new node is inserted after the current tail
            if (prevNode == tail) {
                tail = newNode;
            }
        }

        // Insert a new node before a given node
        public void insertBefore(Node nextNode, int data) {
            if (nextNode == null) {
                System.out.println("Next node cannot be null.");
                return;
            }

            Node newNode = new Node(data);
            newNode.prev = nextNode.prev;
            newNode.next = nextNode;
            if (nextNode.prev != null) {
                nextNode.prev.next = newNode;
            }
            nextNode.prev = newNode;

            // Update head if the new node is inserted before the current head
            if (nextNode == head) {
                head = newNode;
            }
        }

        // ... Other methods ...
    }

    /**
     * Insertion in a Doubly Linked List
     * To insert a node into a doubly linked list:
     * Create a new node with the desired data.
     * Update the references of adjacent nodes to incorporate the new node.
     * Adjust the head or tail pointers if necessary.
     * Insertion at the Beginning
     * 
     * @param head
     */

    public void insertAtBeginning(int data, Node head, Node tail) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insertion at the End
    public void insertAtEnd(int data, Node head, Node tail) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * Removing the Head Node:
     * If the node to be removed is the head, update the head pointer to the next
     * node.
     * Set the prev reference of the new head (if exists) to null.
     */
    public void removeHead(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    /**
     * Removing the Tail Node:
     * If the node to be removed is the tail, update the tail pointer to the
     * previous node.
     * Set the next reference of the new tail (if exists) to null.
     */
    public void removeTail(Node tail) {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        }
    }

    /**
     * Removing an Intermediate Node:
     * Given a node currentNode to remove:
     * Update the next reference of the previous node to point to currentNode.next.
     * Update the prev reference of the next node to point to currentNode.prev.
     */
    public void removeNode(Node currentNode, Node head, Node tail) {
        if (currentNode == null) {
            System.out.println("Node to remove cannot be null.");
            return;
        }
        if (currentNode == head) {
            removeHead(head);
            return;
        }
        if (currentNode == tail) {
            removeTail(tail);
            return;
        }
        currentNode.prev.next = currentNode.next;
        currentNode.next.prev = currentNode.prev;
    }

    public static void main(String[] args) {

        Node node = new Node(1000);
        System.out.println(node + "Hello World!");

    }
}