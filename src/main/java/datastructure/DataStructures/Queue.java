package datastructure.DataStructures;

public class Queue<T> {

    private Node<T> first;
    private Node<T> last;
    private int length;

    public class Node<T> {
        public T value;

        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    public Queue(T value) {
        Node<T> newNode = new Node<>(value);
        this.first = newNode;
        this.last = newNode;
        length++;
    }

    public Node<T> getFirst() {
        if (first != null) {
            return first;
        } else {
            return null;
        }
    }

    public Node<T> getLast() {
        if (last != null) {
            return last;

        } else {
            return null;
        }
    }

    public int getLength() {
        return length;
    }

    public void print() {
        System.out.println("##############");
        Node<T> temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("##############");
    }

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
