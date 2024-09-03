package com.test.concepts.learn.spring.bean_scope.prototype_scope.exercises.exercises_004;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.2.3
 * @since 21.0.0 2024-09-03
 */
@Configuration
public class LoggerConfig {

    @Bean
    @Scope("prototype")
    public LoggerService loggerService(){
       return new LoggerService();
    }
}
