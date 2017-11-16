package com.company;

public interface List<T> extends Iterable {

    void add(T element);

    void addToBegin(T object);

    T get(int index);

    void remove(T object);

    int indexOf(T object);

    int size();
}
