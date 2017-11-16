package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList.add("First");
        LinkedList.add("Second");
        LinkedList.add("Third");
        LinkedList.add("Fourth");
        LinkedList.add("Fifth");
        LinkedList.addToBegin("Zeroth");

        Iterator iterator = LinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
