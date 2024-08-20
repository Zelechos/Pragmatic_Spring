package com.test.concepts.learn.spring.bean_environment.exercise_000;

import lombok.Data;

/**
 * Learn Bean Environment
 *
 * @author Alex T.H.
 * @version v0.1.8
 * @since 21.0.0 2024-08-20
 */
@Data
public class Usage {

    private double queue_time;
    private int prompt_tokens;
    private double prompt_time;
    private int completion_tokens;
    private double completion_time;
    private int total_tokens;
    private double total_time;

}
