package com.test.concepts.learn.spring.dependency_injection.exercise004;

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
@NoArgsConstructor
@AllArgsConstructor
public class HackerWork implements Skills {
    private String nickName;

    @Override
    public List<String> getSkills() {
        return List.of("Pentesting", "Fishing", "Cracking");
    }

    @Override
    public String nickName() {
        this.nickName = "H3rL0x";
        return this.nickName;
    }

    @Override
    public String knowledge() {
        return "I Love Hacking and Coding";
    }

    @Override
    public String toString() {
        return "HackerWork{" +
                "nickName='" + nickName() + '\'' +
                "knowledge='" + knowledge() + '\'' +
                "skills='" + getSkills() + '\'' +
                '}';
    }
}
