package com.company.flight;

public interface FlightsDao {
        void save(Flight flight);
        Flight find(Long id);
        void update(Flight flight);
        void delete(Flight flight);
}
