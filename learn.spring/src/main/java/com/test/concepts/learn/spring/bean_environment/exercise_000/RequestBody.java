package com.test.concepts.learn.spring.bean_environment.exercise_000;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Learn Basics Concepts
 *
 * @author Alex T.H.
 * @version v0.1.7
 * @since 21.0.0 2024-08-19
 */
@Data
@AllArgsConstructor
public class RequestBody {

    private List<Message> messages;
    private String model;

}
