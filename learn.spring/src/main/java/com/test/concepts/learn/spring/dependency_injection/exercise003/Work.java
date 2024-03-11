package com.test.concepts.learn.spring.dependency_injection.exercise003;

import java.util.List;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.0.9
 * @since 21.0.0 2024-03-11
 */
public interface Work {

    List<String> programmingLanguages();

    int yearOfExperience();

    List<TICourse> courses();


}
