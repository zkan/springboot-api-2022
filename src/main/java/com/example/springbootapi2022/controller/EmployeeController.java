package com.example.springbootapi2022.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public String listAllEmployees() {
        return "Hello World";
    }

}
