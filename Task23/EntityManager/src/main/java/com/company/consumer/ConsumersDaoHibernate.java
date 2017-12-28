package com.company.consumer;

import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class ConsumersDaoHibernate implements ConsumersDao {
    private EntityManager entityManager;

    public ConsumersDaoHibernate(EntityManagerFactory entityManagerFactory) {
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public void save(Consumer consumer) {
        entityManager.getTransaction().begin();
        entityManager.persist(consumer);
        entityManager.getTransaction().commit();
    }

    @Override
    public Consumer find(Long id) {
        return entityManager.find(Consumer.class, id);
    }

    @Override
    public void update(Consumer consumer) {
        entityManager.getTransaction().begin();
        entityManager.refresh(consumer);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(Consumer consumer) {
        entityManager.getTransaction().begin();
        entityManager.remove(consumer);
        entityManager.getTransaction().commit();

    }
}
