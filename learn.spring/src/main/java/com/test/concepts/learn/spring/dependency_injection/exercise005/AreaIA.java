package com.test.concepts.learn.spring.dependency_injection.exercise005;

import java.time.LocalDateTime;

/**
 * Learn Dependency Injection use Annotation @Qualifier
 *
 * @author Alex T.H.
 * @version v0.1.0
 * @since 21.0.0 2024-03-19
 */
public interface AreaIA {

    String name();

    String description();

    LocalDateTime getCurrentDate();
}
