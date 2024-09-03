package com.test.concepts.learn.spring.bean_scope.singleton_scope.exercises.exercise_001;


/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.2.1
 * @since 21.0.0 2024-09-02
 */
public class AppSingletonScope {

    public static void main(String[] args) {

        UserService userService = new UserService();
        System.out.println(userService.hashCode());

        UserService userService1 = new UserService();
        System.out.println(userService1.hashCode());

    }
}
