package com.practice;

import java.util.List;

public class ListManager {
    public void addElementAtTheBeginning(List<Book> list, Book el) {
        long begin = System.nanoTime();
        System.out.println("\nAdding -> " + el);
        list.add(0, el);
        long end = System.nanoTime();
        System.out.println("Adding element at the beginning of the LinkedList collection has taken: " + (end - begin) + "ns");
    }

    public void addElementAtTheEnd(List<Book> list, Book el) {
        long begin = System.nanoTime();
        System.out.println("\nAdding -> " + el);
        list.add(el);
        long end = System.nanoTime();
        System.out.println("Adding element at the end of the LinkedList collection has taken: " + (end - begin) + "ns");
    }

    public void removeElementFromTheBeginning(List<Book> list, Book el) {
        long begin = System.nanoTime();
        System.out.println("\nRemoving -> " + list.get(0));
        list.remove(0);
        long end = System.nanoTime();
        System.out.println("Removing element from the beginning of the LinkedList collection has taken: " + (end - begin) + "ns");
    }

    public void removeElementFromTheEnd(List<Book> list, Book el) {
        long begin = System.nanoTime();
        System.out.println("\nRemoving -> " + list.get(list.size()-1));
        list.remove(el);
        long end = System.nanoTime();
        System.out.println("Removing element from the end of the LinkedList collection has taken: " + (end - begin) + "ns");
    }
}
