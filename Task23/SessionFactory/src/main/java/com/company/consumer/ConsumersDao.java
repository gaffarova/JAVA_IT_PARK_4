package com.company.consumer;

public interface ConsumersDao<T> {
    void save(T consumer);
    T find(String name);
    void update(T consumer);
    void delete(T consumer);



}
