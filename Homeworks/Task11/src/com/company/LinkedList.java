package com.company;

public class LinkedList<T> implements List<T> {

    private Node head;

    private Node tail;

    private int count;

    public LinkedList() {

        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    @Override
    public void add(T element) {
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
    public void addToBegin(T object) {
        Node newNode = new Node(object);

        if (head == null) {
            tail = newNode;
        }

        newNode.next = head;
        head = newNode;
        count++;
    }

    @Override
    public T get(int index) {
        if (index < 0 && index >= count) {
            throw new IllegalArgumentException();
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return (T)currentNode.value;
    }

    @Override
    public void remove(T object) {
        while (head != null) {
            if (object.equals(head.object)
        }


    }

    @Override
    public int indexOf(T object) {
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
        public T next() {
            T element = (T)currentNode.value;
            currentNode = currentNode.next;
            return element;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }
    }

    private static class Node<T> {
        T value;
        Node next;

        Node(T value) {
            this.value = value;
        }
    }


}
