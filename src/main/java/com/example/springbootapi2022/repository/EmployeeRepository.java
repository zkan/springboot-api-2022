package com.example.springbootapi2022.repository;

import com.example.springbootapi2022.entity.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EmployeeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(Employee employee) {
        entityManager.persist(employee);
    }

    public List<Employee> listAllEmployees() {
        // JPQL
        Query query = entityManager.createQuery("from Employee", Employee.class);
        return query.getResultList();
    }

    public Employee getEmployee(Integer id) {
        return entityManager.find(Employee.class, id);
    }

}
