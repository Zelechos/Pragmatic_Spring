package com.test.concepts.learn.spring.bean_scope.singleton_scope.exercises.exercise_001;

import com.test.concepts.learn.spring.bean_scope.singleton_scope.SingletonService;
import com.test.concepts.learn.spring.bean_scope.singleton_scope.exercises.exercise_000.MyAppConfig;
import com.test.concepts.learn.spring.bean_scope.singleton_scope.exercises.exercise_000.MyEnvironment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.2.1
 * @since 21.0.0 2024-09-03
 */
public class AppSingletonScopeTest {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Singleton.class);
        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(MyAppConfig.class);

        UserService user = applicationContext.getBean(UserService.class);
        UserService user1 = applicationContext.getBean(UserService.class);
        System.out.println((user == user1) ? "Son el mismo Bean" : "Son diferentes Beans");

        SingletonService singletonService = applicationContext.getBean(SingletonService.class);
        SingletonService singletonService1 = applicationContext.getBean(SingletonService.class);
        boolean isSingleton = (singletonService1 == singletonService);
        System.out.println(isSingleton);

        MyEnvironment env = applicationContext1.getBean(MyEnvironment.class);
        env.setCreator("Ether");
        MyEnvironment env1 = applicationContext1.getBean(MyEnvironment.class);
        boolean isSingletonEnvironment = (env1 == env);
        System.out.println(isSingletonEnvironment);
        System.out.println(env1.getCreator());

    }
}
