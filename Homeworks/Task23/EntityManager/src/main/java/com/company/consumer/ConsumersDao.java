package com.company.consumer;

public interface ConsumersDao {
    void save(Consumer consumer);
    Consumer find(Long id);
    void update(Consumer consumer);
    void delete(Consumer consumer);



}
