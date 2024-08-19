package com.test.concepts.learn.spring.bean_environment.exercise_000;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Learn Basics Concepts
 *
 * @author Alex T.H.
 * @version v0.1.7
 * @since 21.0.0 2024-08-19
 */
@Data
@Component
public class ModelIA {

    @Autowired
    private Groq groq;
    private String prompt;
    private String response;

    public void useModel() {
        groq.printGroqKey();
    }
}
