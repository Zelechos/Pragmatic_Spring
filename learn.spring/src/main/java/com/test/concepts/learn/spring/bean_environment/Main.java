package com.test.concepts.learn.spring.bean_environment;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.test.concepts.learn.spring.bean_environment.exercise_000.ApiServiceModelAi;
import com.test.concepts.learn.spring.bean_environment.exercise_000.ModelIA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.IOException;
import java.util.Scanner;

/**
 * Learn Bean Environment
 *
 * @author Alex T.H.
 * @version v0.1.8
 * @since 21.0.0 2024-08-20
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = SpringApplication.run(Main.class, args);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce your Question : ");
        String prompt = scanner.nextLine();
        ApiServiceModelAi api = context.getBean(ApiServiceModelAi.class);
        System.out.println("Response Model AI : " + api.processingPrompt(prompt));
    }

}
