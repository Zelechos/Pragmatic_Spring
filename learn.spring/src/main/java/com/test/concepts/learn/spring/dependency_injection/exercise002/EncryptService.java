package com.test.concepts.learn.spring.dependency_injection.exercise002;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.0.5
 * @since 21.0.0 2024-02-07
 */
public interface EncryptService {

    String encrypt(String password);

    String decrypt(String password);
}
