package datastructure.DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tree<T> {

    public Node<T> root;

    /**
     * Represents a node in the tree, containing a value and references to its children.
     */
    public class Node<T> {
        Node<T> left;
        Node<T> right;
        T value;

        /**
         * Constructor to create a new node with the specified value.
         *
         * @param value The value to be stored in the node.
         */
        public Node(T value){
            this.value = value;
            this.left = null;
            this.right = null;
        }

        /**
         * Retrieves the value stored in the node.
         *
         * @return The value stored in the node.
         */
        public T getValue() {
            return this.value;
        }

        /**
         * Retrieves the left child node.
         *
         * @return The left child node.
         */
        public Node<T> getLeft() {
            return this.left;
        }

        /**
         * Retrieves the right child node.
         *
         * @return The right child node.
         */
        public Node<T> getRight() {
            return this.right;
        }

        /**
         * Checks if the node is a leaf node (has no children).
         *
         * @return True if the node is a leaf, otherwise false.
         */
        public boolean isLeaf(){
            return (this.left == null) && (this.right == null);
        }
    }

    /**
     * Constructor to initialize an empty tree.
     */
    public Tree(){
        this.root = null;
    }

    /**
     * Constructor to initialize a tree with a root node containing the specified value.
     *
     * @param value The value to be stored in the root node.
     */
    public Tree(T value){
        this.root = new Node<>(value);
    }

    /**
     * Inserts a new node with the specified value into the tree.
     * If the tree is empty, the new node becomes the root.
     * Otherwise, the node is inserted in breadth-first order as the leftmost available position.
     *
     * @param value The value to be stored in the new node.
     */
    public void insert(T value) {
        if (root == null){
            root = new Node<>(value);
        } else {
            Node<T> newNode = new Node<>(value);
            LinkedList<Node<T>> queue = new LinkedList<>();
            queue.add(root);
            while(queue.size() > 0) {
                Node<T> currentNode = queue.remove();
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    break;
                }
                else {
                    queue.add(currentNode.left);
                }

                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    break;
                }
                else {
                    queue.add(currentNode.right);
                }
            }
        }
    }
    
    /**
     * Performs a Breadth-First Search (BFS) starting from the root to find a node with the specified value.
     *
     * @param value The value to search for in the tree.
     * @return The node containing the value, or null if the value is not found in the tree.
     */
    public Node<T> BFS(T value) {
        if (root == null) return null;

        LinkedList<Node<T>> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            Node<T> currentNode = queue.remove();
            if (currentNode.left != null) queue.add(currentNode.left);
            if (currentNode.right != null) queue.add(currentNode.right);

            if(currentNode.value == value) {
                return currentNode;
            }
        }
        
        return null;
    }

    /**
     * Performs a Pre-Order traversal starting from the root.
     *
     * @return A list of node values in Pre-Order sequence (Root, Left, Right).
     */
    public List<T> preOrder() {
        List<T> values = new ArrayList<>();
        preOrder(root, values);
        return values;
    }

    private void preOrder(Node<T> node, List<T> values) {
        if (node != null) {
            // Add the current node's value to the list
            values.add(node.value);
            // Traverse the left subtree
            preOrder(node.left, values);
            // Traverse the right subtree
            preOrder(node.right, values);
        }
    }

    /**
     * Performs an In-Order traversal starting from the root.
     *
     * @return A list of node values in In-Order sequence (Left, Root, Right).
     */
    public List<T> inOrder() {
        List<T> values = new ArrayList<>();
        inOrder(root, values);
        return values;
    }

    private void inOrder(Node<T> node, List<T> values) {
        if (node != null) {
            // Traverse the left subtree
            inOrder(node.left, values);
            // Add the current node's value to the list
            values.add(node.value);
            // Traverse the right subtree
            inOrder(node.right, values);
        }
    }

    /**
     * Performs a Post-Order traversal starting from the root.
     *
     * @return A list of node values in Post-Order sequence (Left, Right, Root).
     */
    public List<T> posOrder() {
        List<T> values = new ArrayList<>();
        posOrder(root, values);
        return values;
    }

    private void posOrder(Node<T> node, List<T> values) {
        if (node != null) {
            // Traverse the left subtree
            posOrder(node.left, values);
            // Traverse the right subtree
            posOrder(node.right, values);
            // Add the current node's value to the list
            values.add(node.value);
        }
    }
}
