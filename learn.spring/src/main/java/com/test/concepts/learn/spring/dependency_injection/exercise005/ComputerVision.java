package com.test.concepts.learn.spring.dependency_injection.exercise005;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

/**
 * Learn Dependency Injection use Annotation @Qualifier
 *
 * @author Alex T.H.
 * @version v0.1.0
 * @since 21.0.0 2024-03-19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("ComputerVision")
public class ComputerVision implements AreaIA{

    private String name;
    private String description;
    private LocalDateTime date;

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String description() {
        return this.description;
    }

    @Override
    public LocalDateTime getCurrentDate() {
        return this.date;
    }
}
