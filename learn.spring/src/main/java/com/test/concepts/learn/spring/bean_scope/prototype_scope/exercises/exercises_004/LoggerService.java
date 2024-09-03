package com.test.concepts.learn.spring.bean_scope.prototype_scope.exercises.exercises_004;

import org.springframework.stereotype.Service;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.2.3
 * @since 21.0.0 2024-09-03
 */
@Service
public class LoggerService {
    public void log(String message) {
        System.out.println(message);
    }
}
