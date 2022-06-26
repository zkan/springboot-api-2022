package com.example.springbootapi2022.repository;

import com.example.springbootapi2022.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// Entity, Primary Key
public interface EmployeeDataRepository extends JpaRepository<Employee, Integer> {

    // Follow convention findBy<Attribute>
    List<Employee> findByFirstName(String firstName);

    @Query("select o from Employee o where o.lastName = ?1")
    List<Employee> findByLastName(String lastName);

    @Query(value = "select * from EMPLOYEE where FIRST_NAME = ?1 and LAST_NAME = ?2", nativeQuery = true)
    List<Employee> findBySomething(String firstName, String lastName);

    List<Employee> findByFirstNameAndLastName(String firstName, String lastName);

}
