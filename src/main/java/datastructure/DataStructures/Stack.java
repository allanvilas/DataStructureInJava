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
     * to the previous node in the stack.
     */
    public class Node<T> {
        T value;
        Node<T> previous;

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
     * Method to return if the stack is empty.
     */
    public boolean isEmpty() {
        if(top == null){
            return true;
        } else { 
            return false;
        }
    }

    /**
     * Method to get the top node of the stack.
     * 
     * @return The top node of the stack, or null if the stack is empty.
     */
    public Node<T> peek() {
        return top;
    }

    /**
     * Method to get the current height (number of nodes) of the stack.
     * 
     * @return The height of the stack.
     */
    public int size() {
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
            newNode.previous = top;
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
        top = top.previous;
        temp.previous = null;
        height--;
        return true;
    }

    /**
     * Make a linear search inside the stack.
     * 
     * @param value to be search value.
     * @return retunrs the first module containg the searched value.
     */
    public Node<T> contains(T value) {
        // check if the stack is empt
        if(top == null) return null;

        // Instace the top node to start the search
        Node<T> tempNode = this.top;

        for (int index = 0; index < height; index++) {
            if(tempNode.value == value) {
                // if find the value retunr the node
                return tempNode;
            } else {
                // jump to previous node in the stack.
                tempNode = tempNode.previous;
            }
        }
        // if dont find returns null.
        return null;
    }
}
