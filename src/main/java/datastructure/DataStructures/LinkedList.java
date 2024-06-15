package datastructure.DataStructures;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;

    public class Node<T> {
        private T data;

        Node<T> next;

        Node(T data) {
            this.data = data;
        }

        public T getData(){
            return this.data;
        }
    }

    public LinkedList(T data) {
        length = 1;
        Node<T> newNode = new Node<T>(data);
        head = newNode;
        tail = newNode;
    }

    public Node<T> getHead() {
        if (this.head == null) {
            return null;
        } else {
            return head;
        }
    }

    public Node<T> getTail() {
        if (this.tail == null) {
            return null;
        } else {
            return tail;
        }
    }

    public int getLength() {
        return this.length;
    }

    public Node<T> get(int index) {
        if (index < 0 || index >= length)
            return null;
        Node<T> temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

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

    public void append(T data) {
        Node<T> newNode = new Node<T>(data);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        length++;
    }

    public boolean insert(int index, T data) {

        if (index < 0 || index >= length)
            return false;

        if (index == 0) {
            prepend(data);
            return true;
        }
        if (index == length) {
            append(data);
            return true;
        }

        Node<T> newNode = new Node<T>(data);
        Node<T> temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public boolean set(int index, T data) {
        Node<T> temp = get(index);

        if (temp != null) {
            temp.data = data;
            return true;
        }
        return false;
    }

    public void prepend(T data) {

        Node<T> newNode = new Node<T>(data);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        length++;
    }

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

    public void print() {
        Node<T> temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
