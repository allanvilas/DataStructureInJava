package datastructure.DataStructures;

public class Queue<T> {

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
     * Retrieves the current size of the queue.
     *
     * @return The current number of elements in the queue.
     */
    public int getLength() {
        return length;
    }

    /**
     * Adds a new element to the end of the queue.
     *
     * @param value The value to be added to the queue.
     */
    public void enqueue(T value) {
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
    public Node<T> dequeue() {
        if (length == 0)
            return null;

        Node<T> temp = first;

        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }
}
