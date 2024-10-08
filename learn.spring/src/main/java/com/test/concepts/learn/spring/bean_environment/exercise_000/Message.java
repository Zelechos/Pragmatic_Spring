package com.test.concepts.learn.spring.bean_environment.exercise_000;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Learn Bean Environment
 *
 * @author Alex T.H.
 * @version v0.1.8
 * @since 21.0.0 2024-08-20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private String role;
    private String content;

}
