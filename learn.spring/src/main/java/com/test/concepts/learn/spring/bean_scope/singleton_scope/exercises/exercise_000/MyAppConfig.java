package com.test.concepts.learn.spring.bean_scope.singleton_scope.exercises.exercise_000;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.2.1
 * @since 21.0.0 2024-09-02
 */
@Configuration
public class MyAppConfig {

    @Bean
    public MyEnvironment myEnvironment(){
        return new MyEnvironment();
    }

}
