package com.test.concepts.learn.spring.bean_scope.singleton_scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.1.5
 * @since 21.0.0 2024-02-18
 */
@Service
//@Scope("singleton") El scope singleton es el scope por defecto en cualquier Bean, no es necesario anotarlo
public class SingletonService {

    public void serve() {
        System.out.println("Serving with a singleton bean");
    }

    @Bean
    @Scope("singleton") // De igual manera aqui no es necesario
    public void service(){
        System.out.println("Another Bean with singleton scope");
    }

}



