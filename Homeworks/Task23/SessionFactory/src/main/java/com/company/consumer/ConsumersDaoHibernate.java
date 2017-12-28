package com.company.consumer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class ConsumersDaoHibernate<T> implements ConsumersDao<T> {
    private SessionFactory sessionFactory;

    public ConsumersDaoHibernate (SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(T consumer) {
        Session session = sessionFactory.openSession();
        session.save(consumer);
    }

    @Override
    public T find(String name) {
        Session session = sessionFactory.openSession();
        Query<Consumer> consumerQuery =
                session.createQuery("from Consumer consumer where consumer.id = ?", Consumer.class);
        Consumer consumer = consumerQuery.getSingleResult();
        return (T) consumer;
    }

    @Override
    public void update(T consumer) {
        Session session = sessionFactory.openSession();
        session.update(consumer);
    }

    @Override
    public void delete(T consumer) {
        Session session = sessionFactory.openSession();
        session.delete(consumer);

    }
}
