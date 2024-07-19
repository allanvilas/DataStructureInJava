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
        private T value;
        Node<T> next;

        /**
         * Constructor to create a new node with a specified value.
         *
         * @param value The value to be stored in the node.
         */
        Node(T value) {
            this.value = value;
        }

        public boolean setValue(T value) {
                try {
                    this.value = value;
                    return true;
                } catch (Exception e) {
                    return false;
                }
        }

        public T getValue() {
            return this.value;
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
     * Define the node value by given index.
     * @param T given value to define on the variable
     * @param index given index when the new value gona be defined
     * @return retuns if this operation is sucessfull
     */
    public boolean set(T value, int index) {
        if(index < 0 && index >= length) return false;

        Node<T> tempNode = get(index);
        
        if(tempNode == null) return false;

        return tempNode.setValue(value);
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
        Node<T> tempNode = this.first;
        switch (length) {
            case 0:
                return null;
            case 1:
                tempNode = this.first;
                clear();
                break;
            case 2:
                tempNode = tempNode.next;
                first.next = null;
                last = first;
                length--;
                break;
            default:
                for (int i = 0; i < (length-2); i++) {
                    tempNode = tempNode.next;
                }

                last = tempNode;
                last.next = null;
                tempNode = tempNode.next;
                length--;
                break;
        }

        return tempNode;
    }

    /**
     * Remove the first value of the queue
     *
     * @return return the removed node.
     */
    public Node<T> removeFirst()
    {
        if (length == 0) return null;
        
        Node<T> tempNode = first;

        if (length == 1) {
            clear();
            return tempNode;
        }
        
        first = tempNode.next;
        return tempNode;

    }

    /**
     * 
     * @param value
     * @return
     */
    public Node<T> remove(int index) {
        if(index < 0 || index >= length) return null;

        if(index == 0) return removeFirst();

        if(index == (length-1)) return removeLast();

        Node<T> tempNode = this.first;
        Node<T> previousNode = null;
        Node<T> afterNode = null;
        for (int i = 0; i < index; i++) {
            
            if( i == (index-1) ) {
                previousNode = tempNode;
            }
            if( i == index && index >= length ) {
                afterNode = tempNode.next;
            }
            tempNode = tempNode.next;            
        }
        
        previousNode.next = afterNode;
        return tempNode;
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
            if (tempNode.getValue() == value) {
                return tempNode;                
            } else {
                tempNode = tempNode.next;
            }
        }

        return null;
    }

    @Override
    public boolean insert(T value, int index) {

        Node<T> newNode = new Node<T>(value);    
        //TODO: add logic to prevent erros when trying to insert the last item of the  queue
        //TODO: add validation for wrong indexes
        switch (index) {
            case 0:
                newNode.next = first;
                first = newNode;
                return true;
            case 1:
                newNode.next = this.first.next.next;
                this.first.next = newNode;
                return true;
            default:
                Node<T> tempNode = this.first;

                for (int i = 1; i <= index; i++) {
                    tempNode = tempNode.next;
        
                    if( i == index-1 ) {
                        newNode.next = tempNode.next;
                        tempNode.next = newNode;
                    }
                }

                return true;

        }
     
    }
}
