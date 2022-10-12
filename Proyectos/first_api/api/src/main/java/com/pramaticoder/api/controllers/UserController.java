package com.pramaticoder.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "code")
public class UserController {

    @GetMapping(value = "/hello-world/{language}", produces = "application/json")
    public String helloWorld(@PathVariable String language) {
        return generateHelloWorld(language);
    }

    private String generateHelloWorld(String language) {
        String helloWorldCode = "programing language not found";

        if ("Java".equals(language)) {
            helloWorldCode = "System.out.println('Hello World');";
        }

        if ("Python".equals(language)) {
            helloWorldCode = "print('Hello World')";
        }

        if ("JavaScript".equals(language)) {
            helloWorldCode = "console.log('Hello World');";
        }

        return helloWorldCode;
    }

}
