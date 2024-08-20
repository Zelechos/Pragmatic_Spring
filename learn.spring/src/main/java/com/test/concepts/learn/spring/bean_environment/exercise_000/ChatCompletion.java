package com.test.concepts.learn.spring.bean_environment.exercise_000;

import lombok.Data;

import java.util.List;

/**
 * Learn Bean Environment
 *
 * @author Alex T.H.
 * @version v0.1.8
 * @since 21.0.0 2024-08-20
 */
@Data
public class ChatCompletion {

    private String id;
    private String object;
    private long created;
    private String model;
    private List<Choice> choices;
    private Usage usage;
    private String system_fingerprint;
    private XGroq x_groq;

}
