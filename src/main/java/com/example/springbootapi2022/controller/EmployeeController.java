package com.example.springbootapi2022.controller;

import com.example.springbootapi2022.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> listAllEmployees() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("Kan");
        employee.setLastName("Ouivirach");

        return Arrays.asList(employee);
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        System.out.println("id: " + id);

        Employee employee = new Employee();
        employee.setId(id);
        employee.setFirstName("Kan");
        employee.setLastName("Ouivirach");

        return employee;
    }

}
