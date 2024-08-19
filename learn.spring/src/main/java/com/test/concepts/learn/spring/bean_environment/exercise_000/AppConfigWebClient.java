package com.test.concepts.learn.spring.bean_environment.exercise_000;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Learn Bean Environment
 *
 * @author Alex T.H.
 * @version v0.1.7
 * @since 21.0.0 2024-08-19
 */
@Configuration
public class AppConfigWebClient {

    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }
}
