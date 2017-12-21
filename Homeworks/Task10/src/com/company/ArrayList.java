package com.company;

public class ArrayList implements List {
    private int[] array;
    private int count;

    public ArrayList() {
        this.count = 0;
    }

    @Override
    public void add(Object element) {
        element = array[count];
        count++;
    }

    @Override
    public void addToBegin(Object object) {

    }

    @Override
    public Object get(int index) {
        return null;
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
        return null;
    }


}
