package com.example.springbootapi2022.controller;

import com.example.springbootapi2022.Employee;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/employees")
    public void createEmployee(@RequestBody Employee employee) {
        System.out.println("employee firstName: " + employee.getFirstName());
        System.out.println("employee lastName: " + employee.getLastName());
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
        System.out.println("id: " + id);
        System.out.println("employee firstName: " + employee.getFirstName());
        System.out.println("employee lastName: " + employee.getLastName());

        return null;
    }

}
