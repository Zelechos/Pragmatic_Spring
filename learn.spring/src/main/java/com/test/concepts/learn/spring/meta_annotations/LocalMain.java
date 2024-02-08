package com.test.concepts.learn.spring.meta_annotations;

import com.test.concepts.learn.spring.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Learn who to create Meta-Annotations
 *
 * @author Alex T.H.
 * @version v0.0.7
 * @since 21.0.0 2024-02-08
 */
@SpringBootApplication
public class LocalMain {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        Engine engine = new Engine("ether","v0.0.7", true);
        System.out.println(engine);
    }
}
