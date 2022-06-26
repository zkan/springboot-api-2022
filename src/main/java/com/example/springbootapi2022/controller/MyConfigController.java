package com.example.springbootapi2022.controller;

import com.example.springbootapi2022.config.MyConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyConfigController {

    @Value("${my.message}")
    private String message;

    @Value("${my.host}")
    private String host;

    @Autowired
    MyConfigProperties configProperties;

    @GetMapping("/config/message")
    public String getMessage() {
        return message + " on " + host;
    }

    @GetMapping("/config/message2")
    public String getMessage2() {
        return configProperties.getMessage() + " on " + configProperties.getHost();
    }

}
