package com.test.concepts.learn.spring.basics;

import java.time.LocalDateTime;

/**
 * Learn Basics Concepts
 *
 * @author Alex T.H.
 * @version v0.1.7
 * @since 21.0.0 2024-08-19
 */
public interface AccountRepository {

    int accountNumber();

    String userName();

    LocalDateTime creationDate();
}
