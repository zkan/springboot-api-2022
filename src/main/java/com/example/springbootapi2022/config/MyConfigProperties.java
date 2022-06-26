package com.example.springbootapi2022.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my")
@Data
public class MyConfigProperties {
    private String message;
    private String host;
}
