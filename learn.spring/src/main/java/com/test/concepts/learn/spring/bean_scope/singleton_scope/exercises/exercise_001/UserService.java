package com.test.concepts.learn.spring.bean_scope.singleton_scope.exercises.exercise_001;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.2.1
 * @since 21.0.0 2024-09-02
 */
@Data
@AllArgsConstructor
@Service
@Scope("singleton")
public class UserService implements Services{

    @Override
    public List<UserService> getAll(String userId) {
        return List.of();
    }

    @Override
    public UserService get(String userId) {
        return null;
    }

    @Override
    public String create() {
        return "";
    }

    @Override
    public UserService put(String userId) {
        return null;
    }

    @Override
    public String delete(String userId) {
        return "";
    }

}
