package com.test.concepts.learn.spring.dependency_injection.exercise002;

import java.util.UUID;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.0.5
 * @since 21.0.0 2024-02-07
 */
public interface AuthorizationService {

    UUID generateKey();

    void showKey();

    boolean validateAuth(UUID key);
}
