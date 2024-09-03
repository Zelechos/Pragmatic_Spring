package com.test.concepts.learn.spring.bean_scope.prototype_scope.exercises.exercise_002;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.2.3
 * @since 21.0.0 2024-09-03
 */
@Data
@AllArgsConstructor
@Service
@Scope("prototype")
public class Logger {

    public void log(String message) {
        System.out.println(message);
    }

}
