package com.test.concepts.learn.spring.bean_scope.prototype_scope.exercises.exercise_003;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.2.3
 * @since 21.0.0 2024-09-03
 */
@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return calculatorService.sum(a, b);
    }

}

