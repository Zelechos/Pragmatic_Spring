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
public class Cryptographer implements Skills{

    private String nickName;
    @Override
    public List<String> getSkills() {
        return List.of("AWS","Google Cloud", "Azure");
    }

    @Override
    public String nickName() {
        nickName = "Th3Arqu1t3ct";
        return nickName;
    }

    @Override
    public String knowledge() {
        return "All about Cloud Computing bitch";
    }

    @Override
    public String toString() {
        return "CloudEngineer{" +
                "nickName='" + nickName() + '\'' +
                "knowledge='" + knowledge() + '\'' +
                "skills='" + getSkills() + '\'' +
                '}';
    }
}
