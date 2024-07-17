package datastructure.DataStructures;

import datastructure.dataStructureInterface.LinearStructure;
public class Queue<T> implements LinearStructure<T> {

    private Node<T> first;
    private Node<T> last;
    private int length;

    /**
     * Represents a node in the queue, containing a value and reference to the next node.
     */
    public class Node<T> {
        public T value;
        Node<T> next;

        /**
         * Constructor to create a new node with a specified value.
         *
         * @param value The value to be stored in the node.
         */
        Node(T value) {
            this.value = value;
        }
    }

    /**
     * Initializes the queue with a node containing the specified value.
     *
     * @param value The initial value to be stored in the first node of the queue.
     */
    public Queue(T value) {
        Node<T> newNode = new Node<>(value);
        this.first = newNode;
        this.last = newNode;
        length++;
    }

    /**
     * Clear the queue
     * 
     */
    public void clear()
    {
        length = 0;
        first = null;
        last = null;
    }

    /**
     * 
     */
    public Node<T> get(int index)
    {
        if(index > (length-1) || index < 0) return null;
        if (index == 0) getFirst();
        if (index == (length-1)) getLast();

        Node<T> returnNode = first;

        for (int i = 0; i < index; i++) {
            returnNode = returnNode.next;
        }
        return returnNode;
    }

    /**
     * Retrieves the first node in the queue.
     *
     * @return The first node in the queue, or null if the queue is empty.
     */
    public Node<T> getFirst() {
        if (first != null) {
            return first;
        } else {
            return null;
        }
    }
    
    /**
     * Retrieves the last node in the queue.
     *
     * @return The last node in the queue, or null if the queue is empty.
     */
    public Node<T> getLast() {
        if (last != null) {
            return last;
        } else {
            return null;
        }
    }
    
    /**
     * Retrieves true if the queue is empty.
     *
     * @return true if the queue is empty.
     */
    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retrieves the current size of the queue.
     *
     * @return The current number of elements in the queue.
     */
    public int size() {
        return length;
    }

    /**
     * Adds a new element to the end of the queue.
     *
     * @param value The value to be added to the queue.
     */
    public void add(T value) {
        Node<T> newNode = new Node<>(value);

        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }

        length++;
    }

    /**
     * Removes and returns the element at the beginning of the queue.
     *
     * @return The removed node, or null if the queue is empty.
     */
    public Node<T> removeLast() {
        if (length == 0)
            return null;

        Node<T> tempNode = first;

        if (length == 1) {
            clear();
        } else {
            first = first.next;
            tempNode.next = null;
        }
        length--;
        return tempNode;
    }

    /**
     * 
     * @param value
     * @return
     */
    public Node<T> removeFirst()
    {
        if (length == 0) return null;
        
        Node<T> tempNode = first;

        if (length == 1) {
            tempNode = get(0);
            clear();
        }
    }

    /**
     * Return the first node that contains the value.
     *
     * @return The first ocurrence node, or null if the queue is empty or if the value don't exists.
     */
    public Node<T> contains(T value) {
        if (length == 0)
            return null;

        Node<T> tempNode = first;

        for (int j = 0; j < length; j++) {
            if (tempNode.value == value) {
                return tempNode;                
            } else {
                tempNode = tempNode.next;
            }
        }

        return null;
    }
}
