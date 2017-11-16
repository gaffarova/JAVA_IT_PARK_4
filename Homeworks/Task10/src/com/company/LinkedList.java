package com.company;

public class LinkedList implements List {

    private Node head;
    private Node tail;
    private int count;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    @Override
    public void add(Object element) {
        Node newNode = new Node(element);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        count++;
    }

    @Override
    public void addToBegin(Object object) {
        Node newNode = new Node(object);
        if (head == null) {
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        count++;
    }

    @Override
    public Object get(int index) {
        if (index < 0 && index >= count) {
            throw new IllegalArgumentException();
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }

    @Override
    public void remove(Object object) {

    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator {
        private Node currentNode = head;

        @Override
        public Object next() {
            Object element = currentNode.value;
            currentNode = currentNode.next;
            return element;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }
    }

    private static class Node {
        Object value;
        Node next;

        Node(Object value) {
            this.value = value;
        }
    }
}
