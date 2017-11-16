package com.company;

public class ArrayList<T> implements List<T> {

    private static final int MAX_SIZE = 10;
    private Object elements[];
    private int count;

    public ArrayList() {
        elements = new Object[MAX_SIZE];
        count = 0;
    }

    @Override
    public void add(T element){
        elements[count] = element;
        count++;
    }

    @Override
    public void addToBegin(T object) {
        for (int i = 0; i < count; i++) {
            elements[i] = elements[i + 1];
        }
        elements[0] = object;

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void remove(T object){

    }

    @Override
    public int indexOf(T object) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }



}
