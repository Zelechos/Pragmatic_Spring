package com.test.concepts.learn.spring.bean_scope.singleton_scope.exercises.exercise_002;


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
@Scope("singleton")
public class ConfigurationManager {

    private String path;
    private String apiKey;
    private String globalConfig;

}
