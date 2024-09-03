package com.test.concepts.learn.spring.bean_scope.prototype_scope.exercises.exercise_001;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
@NoArgsConstructor
@AllArgsConstructor
@Service
@Scope("prototype")
public class Calculator {

    private int num1;
    private int num2;

    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}
