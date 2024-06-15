package datastructure.DataStructures;

public class Stack<T> {

    private Node<T> top;
    private int heigth;

    public class Node<T> {
        T value;

        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    public Stack(T value) {
        Node<T> newNode = new Node<>(value);
        top = newNode;
        heigth = 1;
    }

    public Node<T> getTop() {
        if (top == null) {
            return null;
        } else {
            return top;
        }
    }

    public int getHeigth() {
        return heigth;
    }

    public void print() {
        System.out.println("###############");
        Node<T> temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("###############");
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value);

        if (heigth == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        heigth++;
    }

    public boolean pop() {
        if (heigth == 0) return false;
        
        Node<T> temp = top;
        top = top.next;
        temp.next = null;
        heigth--;
        return true;
    }
}
