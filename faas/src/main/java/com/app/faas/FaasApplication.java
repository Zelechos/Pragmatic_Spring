package com.app.faas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class FaasApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaasApplication.class, args);
    }

}
