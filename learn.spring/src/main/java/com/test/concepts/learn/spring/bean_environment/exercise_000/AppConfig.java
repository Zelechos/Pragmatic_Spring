package com.test.concepts.learn.spring.bean_environment.exercise_000;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Learn Basics Concepts
 *
 * @author Alex T.H.
 * @version v0.1.7
 * @since 21.0.0 2024-08-19
 */
@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
