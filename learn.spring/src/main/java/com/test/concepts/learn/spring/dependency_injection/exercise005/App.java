package com.test.concepts.learn.spring.dependency_injection.exercise005;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Learn Dependency Injection use Annotation @Qualifier
 *
 * @author Alex T.H.
 * @version v0.1.0
 * @since 21.0.0 2024-03-19
 */
@Data
public class App {

    private IA area;

    @Autowired
    public App(IA area) {
        this.area = area;
    }
}
