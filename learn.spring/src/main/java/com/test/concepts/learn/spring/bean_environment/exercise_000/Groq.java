package com.test.concepts.learn.spring.bean_environment;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
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
public class Groq {

    private Environment environment;

    @Autowired
    public Groq(Environment environment){
        this.environment = environment;
    }

    public void printGroqKey(){
        System.out.println(environment.getProperty("groq.api.key"));
    }

    public String getGroqKey(){
        return environment.getProperty("groq.api.key");
    }
}
