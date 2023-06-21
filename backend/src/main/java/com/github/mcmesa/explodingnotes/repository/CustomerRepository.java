package com.github.mcmesa.explodingnotes.repository;

import com.github.mcmesa.explodingnotes.domain.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CustomerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(Customer customer){
        entityManager.persist(customer);
        return customer.getId();
    }
}
