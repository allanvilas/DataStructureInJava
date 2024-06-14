package datastructure;

import datastructure.DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LinkedList list = new LinkedList("Elemento 1");
        list.append("Elemento 2");
        list.append("Elemento 3");
        list.prepend("Elemnto 0");
        list.print();
        list.getHead();
        list.insert(2, "Elemento 2.5");
        list.set(1, "Elemento 10");
        list.getTail();
        list.getLength();
        list.removeLast();
        list.remove(2);
        list.print();
        list.getLength();

        System.out.println(list.get(2));
    }
}