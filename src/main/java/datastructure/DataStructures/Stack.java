package datastructure.DataStructures;

/**
 * Class Stack<T>
 * 
 * This class implements a stack data structure in Java, parameterized with a generic type T.
 */
public class Stack<T> {

    private Node<T> top;
    private int height;

    /**
     * Inner class Node<T>
     * 
     * Represents a node in the stack. Each node holds a value of type T and a reference
     * to the next node in the stack.
     */
    public class Node<T> {
        T value;
        Node<T> next;

        /**
         * Node constructor initializes a node with a given value.
         */
        Node(T value) {
            this.value = value;
        }

        /**
         * Getter method for retrieving the value stored in the node.
         */
        public T getValue() {
            return this.value;
        }
    }

    /**
     * Constructor for Stack class.
     * 
     * Initializes a stack with an initial node containing the specified value.
     */
    public Stack(T value) {
        Node<T> newNode = new Node<>(value);
        top = newNode;
        height = 1;
    }

    /**
     * Method to empty the stack by setting top to null and resetting the height to zero.
     */
    public void makeEmpty() {
        top = null;
        height = 0;
    }

    /**
     * Method to get the top node of the stack.
     * 
     * @return The top node of the stack, or null if the stack is empty.
     */
    public Node<T> getTop() {
        return top;
    }

    /**
     * Method to get the current height (number of nodes) of the stack.
     * 
     * @return The height of the stack.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Method to push a new node with the specified value onto the stack.
     * 
     * @param value The value to be pushed onto the stack.
     */
    public void push(T value) {
        Node<T> newNode = new Node<>(value);

        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    /**
     * Method to pop (remove and return) the top node from the stack.
     * 
     * @return true if pop operation was successful, false if stack was empty.
     */
    public boolean pop() {
        if (height == 0)
            return false;

        Node<T> temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return true;
    }
}
