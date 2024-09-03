package com.test.concepts.learn.spring.bean_scope.singleton_scope.exercises.exercise_000;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.2.1
 * @since 21.0.0 2024-09-02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
@Scope("singleton")
public class MyEnvironment {

    private String environmentName;
    private LocalDate dateOfCreation;
    private String creator;
    private String description;

}
