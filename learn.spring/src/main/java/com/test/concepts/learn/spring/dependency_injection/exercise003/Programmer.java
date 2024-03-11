package com.test.concepts.learn.spring.dependency_injection.exercise003;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.0.9
 * @since 21.0.0 2024-03-11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Programmer implements Work{

    private int yearsOfExperience;
    @Override
    public List<String> programmingLanguages() {
        return List.of("Java", "Python", "TypeScript");
    }

    @Override
    public int yearOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public List<TICourse> courses() {
        return List.of(
                new TICourse("Java Basic", "2024", "Java basic course", "3 months"),
                new TICourse("Java Medium", "2024", "Java medium course", "9 months"),
                new TICourse("Java Advanced", "2024", "Java advanced course", "2 year")
        );
    }
}
