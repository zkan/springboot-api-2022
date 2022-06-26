package com.example.springbootapi2022.controller;

import com.example.springbootapi2022.exception.DataNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity handleDataNotFound(DataNotFoundException exception) {
        return new ResponseEntity(exception.getMessageInfo(), HttpStatus.NOT_FOUND);
    }

}
