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

}