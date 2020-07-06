package com.digitalinnovationone.springbootconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${ENV_DB_URL:NENHUMA}")
    private String dbEnvironmentVariable;

    @Value("${app.message}")
    private String appMessage;

    @GetMapping("/")
    public String getAppMessage() {
        return appMessage;
    }

    @GetMapping("/envVariable")
    public String getDbEnvironmentVariable() {
        return "A seguinte varíavel de ambiente foi passada: " + dbEnvironmentVariable;
    }
}
