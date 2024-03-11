package com.test.concepts.learn.spring.dependency_injection.exercise004;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

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
public class SoftwareEngineer {
    private Skills skills;

    @Autowired
    public void setSoftwareEngineer(Skills skills) {
        this.skills = skills;
    }

    public void injectSoftwareEngineer(Skills skills) {
        this.setSoftwareEngineer(skills);
    }
}
