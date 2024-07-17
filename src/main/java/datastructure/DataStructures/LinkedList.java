package datastructure.DataStructures;
import datastructure.dataStructureInterface.LinearStructure;
import datastructure.dataStructureInterface.NodeInterface;

public class LinkedList<T> implements LinearStructure<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;

    /**
     * Inner class representing a node in the linked list.
     */
    public class Node<T> implements NodeInterface<T> {
        private T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
        @Override
        public T getValue() {
            return this.value;
        }
    }

    /**
     * Constructs a linked list with an initial node containing the specified data.
     * @param data The data to be stored in the initial node.
     */
    public LinkedList(T data) {
        length = 1;
        Node<T> newNode = new Node<>(data);
        head = newNode;
        tail = newNode;
    }

    /**
     * Retrieves the head node of the linked list.
     * @return The head node.
     */
    @Override
    public Node<T> getFirst() {
        return head;
    }

    /**
     * Retrieves the tail node of the linked list.
     * @return The tail node.
     */
    @Override
    public Node<T> getLast() {
        return tail;
    }

    /**
     * Returns the current length of the linked list.
     * @return The length of the linked list.
     */
    @Override
    public int size() {
        return length;
    }

    /**
     * Retrieves the node at the specified index in the linked list.
     * @param index The index of the node to retrieve.
     * @return The node at the specified index, or null if the index is out of bounds.
     */
    @Override
    public Node<T> get(int index) {
        if (index < 0 || index >= length)
            return null;
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * Empties the linked list.
     */
    @Override
    public void clear() {
        head = null;
        tail = null;
        length = 0;
    }

    /**
     * Return true if the linkedList is empty
     */
    @Override
    public boolean isEmpty() {
        if(head == null && tail == null) return true;
        return false;
    }


    /**
     * Removes and returns the first node of the linked list.
     * @return The removed node, or null if the linked list is empty.
     */
    @Override
    public Node<T> removeFirst() {
        if (length == 0)
            return null;
        Node<T> temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    /**
     * Removes and returns the node at the specified index in the linked list.
     * @param index The index of the node to remove.
     * @return The removed node, or null if the index is out of bounds.
     */
    @Override
    public Node<T> remove(int index) {
        if (index < 0 || index >= length)
            return null;
        if (index == 0)
            return removeFirst();
        if (index == length - 1)
            return removeLast();
        Node<T> prev = get(index - 1);
        Node<T> temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    /**
     * Appends a new node with the specified data to the end of the linked list.
     * @param data The data to be stored in the new node.
     */
    @Override
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    /**
     * Inserts a new node with the specified data at the specified index in the linked list.
     * @param index The index at which to insert the new node.
     * @param data The data to be stored in the new node.
     * @return true if the insertion was successful, false otherwise.
     */
    @Override
    public boolean insert(T value,int index) {

        if (index < 0 || index > length) return false;

        if (index == 0) 
        {
            addFirst(value);
            return true;
        }

        if (index == length) 
        {
            add(value);
            return true;
        }

        Node<T> newNode = new Node<>(value);
        Node<T> previousNode = get(index - 1);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
        length++;
        return true;
    }

    /**
     * Sets the data of the node at the specified index in the linked list.
     * @param index The index of the node to set the data for.
     * @param data The new data to be stored in the node.
     * @return true if the operation was successful, false otherwise.
     */
    @Override
    public boolean set(T value,int index) {
        Node<T> temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    /**
     * Prepends a new node with the specified data to the beginning of the linked list.
     * @param data The data to be stored in the new node.
     */
    
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    /**
     * Removes and returns the last node of the linked list.
     * @return The removed node, or null if the linked list is empty.
     */
    @Override
    public Node<T> removeLast() {
        if (length == 0)
            return null;
        Node<T> pre = head;
        Node<T> temp = null;
        while (pre.next != tail) {
            pre = pre.next;
        }
        temp = tail;
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    /**
     * Prints the contents of the linked list.
     */
    public void print() {
        System.out.println("##############");
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("##############");
    }

    
}
