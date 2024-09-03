package com.test.concepts.learn.spring.bean_scope.prototype_scope;


import com.test.concepts.learn.spring.bean_scope.prototype_scope.exercises.exercise_000.AuthenticationService;
import com.test.concepts.learn.spring.bean_scope.prototype_scope.exercises.exercise_000.SessionService;
import com.test.concepts.learn.spring.bean_scope.prototype_scope.exercises.exercise_000.UserConfigServices;
import com.test.concepts.learn.spring.bean_scope.prototype_scope.exercises.exercise_001.Calculator;
import com.test.concepts.learn.spring.bean_scope.prototype_scope.exercises.exercise_001.Controller;
import com.test.concepts.learn.spring.bean_scope.prototype_scope.exercises.exercise_002.ControllerInfoService;
import com.test.concepts.learn.spring.bean_scope.prototype_scope.exercises.exercise_002.InfoService;
import com.test.concepts.learn.spring.bean_scope.prototype_scope.exercises.exercise_002.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.2.3
 * @since 21.0.0 2024-09-03
 */
public class TestPrototypeScopeExercises {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(UserConfigServices.class);
        AuthenticationService userAuthenticationService = appContext.getBean(AuthenticationService.class);
        AuthenticationService userAuthenticationService1 = appContext.getBean(AuthenticationService.class);

        System.out.println((userAuthenticationService1 == userAuthenticationService) ? "Son los mismo Beans" : "Los Beans son Diferentes");

        SessionService userSessionService = appContext.getBean(SessionService.class);
        SessionService userSessionService1 = appContext.getBean(SessionService.class);

        System.out.println((userSessionService1 == userSessionService) ? "Son los mismo Beans" : "Los Beans son Diferentes");

        // --------------------------------  Exercise_001 --------------------------------------------
        ApplicationContext app = new AnnotationConfigApplicationContext(Controller.class);
        Calculator calculator = app.getBean(Calculator.class);
        System.out.println(calculator.sum(9,1));

        // --------------------------------  Exercise_002 --------------------------------------------
        ApplicationContext app2 = new AnnotationConfigApplicationContext(ControllerInfoService.class);
        InfoService infoService = app2.getBean(InfoService.class);
        infoService.logging(infoService.logger(),"this is my message");


    }
}
