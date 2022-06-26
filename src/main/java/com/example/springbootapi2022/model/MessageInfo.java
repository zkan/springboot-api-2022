package com.example.springbootapi2022.model;

import lombok.Data;

@Data
public class MessageInfo {
    private String code;
    private String description;

    public MessageInfo(String code, String description) {
        this.code = code;
        this.description = description;
    }
}
