package com.test.concepts.learn.spring.bean_scope.prototype_scope.exercises.exercise_002;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
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
public class InfoService {

    @Bean
    public Logger logger() {
        return new Logger();
    }

    public void logging(Logger logger, String message){
       logger.log(message);
    }

}
