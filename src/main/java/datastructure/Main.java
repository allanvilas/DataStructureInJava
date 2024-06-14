package datastructure;

import datastructure.DataStructures.LinkedList;
import datastructure.DataStructures.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LinkedList list = new LinkedList("Elemento 1");
        // list.append("Elemento 2");
        // list.append("Elemento 3");
        // list.prepend("Elemnto 0");
        // list.print();
        // list.getHead();
        // list.insert(2, "Elemento 2.5");
        // list.set(1, "Elemento 10");
        // list.getTail();
        // list.getLength();
        // list.removeLast();
        // list.remove(2);
        // list.print();
        // list.getLength();
        // System.out.println(list.get(2));




        // teste stack

        Stack stack = new Stack(4);

        stack.getTop();
        stack.getHeigth();
        stack.print();
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.print();
        stack.getTop();
        stack.getHeigth();
        stack.pop();
        stack.print();
        stack.getTop();
        stack.getHeigth();
        stack.pop();
        stack.print();
        stack.getTop();
        stack.getHeigth();


    }
}