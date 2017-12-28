package com.company.flight;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class FlightsDaoHibernate implements FlightsDao {
    private EntityManager entityManager;

    public FlightsDaoHibernate(EntityManagerFactory entityManagerFactory) {
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public void save(Flight flight) {
        entityManager.getTransaction().begin();
        entityManager.persist(flight);
        entityManager.getTransaction().commit();
    }

    @Override
    public Flight find(Long id) {
        return entityManager.find(Flight.class, id);
    }

    @Override
    public void update(Flight flight) {
        entityManager.getTransaction().begin();
        entityManager.refresh(flight);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(Flight flight) {
        entityManager.getTransaction().begin();
        entityManager.remove(flight);
        entityManager.getTransaction().commit();
    }
}
