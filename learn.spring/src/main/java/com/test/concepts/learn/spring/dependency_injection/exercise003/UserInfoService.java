package com.test.concepts.learn.spring.dependency_injection.exercise003;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.1.2
 * @since 21.0.0 2024-07-18
 */
@Data
@Service
public class UserInfoService implements DataSource {

    private String data;

    @Override
    public String stateOfData() {
        return "<DATA NOT FOUND>";
    }
}
