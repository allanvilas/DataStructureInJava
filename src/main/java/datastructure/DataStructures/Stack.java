package datastructure.DataStructures;

public class Stack {

    private Node top;
    private int heigth;

    public class Node {
        int value;

        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        heigth = 1;
    }

    public void getTop() {
        if (top == null) {
            System.out.println("Pilha vazia.");
        } else {
            System.err.println("Top: " + top.value);
        }
    }

    public void getHeigth() {
        System.out.println("Heigth: " + heigth);
    }

    public void print() {
        System.out.println("###############");
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("###############");
    }

    public void push(int value) {
        Node newNode = new Node(value);

        if (heigth == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        heigth++;
    }

    public Node pop() {
        if (heigth == 0)
            return null;
        Node temp = top;
        top = top.next;
        temp.next = null;
        heigth--;
        return temp;
    }
}
