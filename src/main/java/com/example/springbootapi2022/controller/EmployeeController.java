package com.example.springbootapi2022.controller;

import com.example.springbootapi2022.entity.Employee;
import com.example.springbootapi2022.repository.EmployeeRepository;
import com.example.springbootapi2022.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> listAllEmployees() {
//        Employee employee = new Employee();
//        employee.setId(1);
//        employee.setFirstName("Kan");
//        employee.setLastName("Ouivirach");

//        return Arrays.asList(employee);
        return employeeService.listAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
//        System.out.println("id: " + id);
//
//        Employee employee = new Employee();
//        employee.setId(id);
//        employee.setFirstName("Kan");
//        employee.setLastName("Ouivirach");
//
//        return employee;

        return employeeService.getEmployee(id);
    }

    @PostMapping("/employees")
    public void createEmployee(@RequestBody Employee employee) {
        System.out.println("employee firstName: " + employee.getFirstName());
        System.out.println("employee lastName: " + employee.getLastName());

        employeeService.createEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    public void updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
        System.out.println("id: " + id);
        System.out.println("employee firstName: " + employee.getFirstName());
        System.out.println("employee lastName: " + employee.getLastName());

        employeeService.updateEmployee(id, employee);
    }

    @PostMapping("employees/search")
    public List<Employee> searchEmployee(@RequestBody Employee employee) {
        return employeeService.searchByFirstName(employee);
    }

}
