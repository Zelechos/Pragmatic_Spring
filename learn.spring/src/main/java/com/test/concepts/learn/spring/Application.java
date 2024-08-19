package com.test.concepts.learn.spring;

import com.test.concepts.learn.spring.bean_environment.exercise_000.Groq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Learn Basics
 *
 * @author Alex T.H.
 * @version v0.0.6
 * @since 21.0.0 2024-07-27
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private Groq groq;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("--------------------Welcome my Study of Spring---------------------------");
    }

    @Override
    public void run(String...args) throws Exception{
        groq.printGroqKey();
    }
}
