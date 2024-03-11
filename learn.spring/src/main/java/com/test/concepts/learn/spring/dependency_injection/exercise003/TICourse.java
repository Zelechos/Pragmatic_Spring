package com.test.concepts.learn.spring.dependency_injection.exercise003;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class TICourse {
    private String name;
    private String date;
    private String description;
    private String durationTime;
}
