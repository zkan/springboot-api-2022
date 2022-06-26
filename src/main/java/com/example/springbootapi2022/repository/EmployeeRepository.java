package com.example.springbootapi2022.repository;

import com.example.springbootapi2022.entity.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class EmployeeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(Employee employee) {
        entityManager.persist(employee);
    }

}
