package com.example.springbootapi2022.service;

import com.example.springbootapi2022.entity.Employee;
import com.example.springbootapi2022.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> listAllEmployees() {
        return employeeRepository.listAllEmployees();
    }

    public Employee getEmployee(Integer id) {
        return employeeRepository.getEmployee(id);
    }

    public void updateEmployee(Integer id, Employee employee) {
        Employee existingEmployee = getEmployee(id);
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        employeeRepository.save(existingEmployee);
    }

    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public List<Employee> searchByFirstName(Employee employee) {
        String firstName = employee.getFirstName();
        return employeeRepository.searchByFirstName(firstName);
    }
}
