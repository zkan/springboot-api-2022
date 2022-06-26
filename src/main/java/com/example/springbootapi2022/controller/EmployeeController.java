package com.example.springbootapi2022.controller;

import com.example.springbootapi2022.Employee;
import org.springframework.web.bind.annotation.GetMapping;
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

}
