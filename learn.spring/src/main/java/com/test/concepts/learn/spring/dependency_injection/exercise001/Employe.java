package com.test.concepts.learn.spring.dependency_injection.exercise001;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.0.5
 * @since 21.0.0 2024-02-08
 */
@Data
@Component
public class Employe {

    private final EmployService employeService;

    // Inyeccion de Dependencia mediante el constructor
    @Autowired
    public Employe(EmployService employeService){
        this.employeService = employeService;
    }
}
