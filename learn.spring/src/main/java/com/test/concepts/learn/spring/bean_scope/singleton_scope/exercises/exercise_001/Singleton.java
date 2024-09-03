package com.test.concepts.learn.spring.bean_scope.singleton_scope.exercises.exercise_001;

import com.test.concepts.learn.spring.bean_scope.singleton_scope.SingletonService;
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
public class Singleton {

    @Bean
    public UserService userService() {
        return new UserService();
    }

    @Bean
    public SingletonService singletonService(){
        return new SingletonService();
    }

}
