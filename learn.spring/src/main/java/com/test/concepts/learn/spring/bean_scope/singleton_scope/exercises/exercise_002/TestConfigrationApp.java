package com.test.concepts.learn.spring.bean_scope.singleton_scope.exercises.exercise_002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.2.3
 * @since 21.0.0 2024-09-03
 */
public class TestConfigrationApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationApp.class);
        ConfigurationManager configurationManager = applicationContext.getBean(ConfigurationManager.class);
        ConfigurationManager configurationManager1 = applicationContext.getBean(ConfigurationManager.class);

        boolean isEquals = configurationManager1.equals(configurationManager);
        System.out.println(isEquals);

    }
}
