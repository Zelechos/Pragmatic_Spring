package com.test.concepts.learn.spring.bean_scope.singleton_scope.exercises.exercise_001;

import java.util.List;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.2.1
 * @since 21.0.0 2024-09-02
 */
public interface Services {

    List<UserService> getAll(String userId);

    UserService get(String userId);

    String create();

    UserService put(String userId);

    String delete(String userId);

}
