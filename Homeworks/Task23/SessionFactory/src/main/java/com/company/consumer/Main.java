package com.company.consumer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();

        configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/postgres");
        configuration.setProperty("hibernate.connection.username", "postgres");
        configuration.setProperty("hibernate.connection.password", "nemequittepas");
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL95Dialect");
        configuration.setProperty("show_sql", "true");

        configuration.addAnnotatedClass(Consumer.class);

        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        Query<Consumer> consumerQuery =
                session.createQuery("from Consumer consumer where consumer.id = ?", Consumer.class);

        consumerQuery.setParameter(0, 3L);
        Consumer consumer = consumerQuery.getSingleResult();
        System.out.println(consumer);


    }
}
