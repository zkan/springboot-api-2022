package com.example.springbootapi2022.service;

import com.example.springbootapi2022.entity.Employee;
import com.example.springbootapi2022.exception.DataNotFoundException;
import com.example.springbootapi2022.model.MessageInfo;
import com.example.springbootapi2022.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> listAllEmployees() {
        return employeeRepository.listAllEmployees();
    }

    public Employee getEmployee(Integer id) {
        Employee employee = employeeRepository.getEmployee(id);
        if (employee == null) {
            throw new DataNotFoundException(new MessageInfo("10001", "ไม่พบข้อมูล"));
        }
        return employee;
    }

    @Transactional
    public void updateEmployee(Integer id, Employee employee) {
        Employee existingEmployee = getEmployee(id);
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        employeeRepository.save(existingEmployee);
    }

    @Transactional
    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public List<Employee> searchByFirstName(Employee employee) {
        String firstName = employee.getFirstName();
        return employeeRepository.searchByFirstName(firstName);
    }
}
