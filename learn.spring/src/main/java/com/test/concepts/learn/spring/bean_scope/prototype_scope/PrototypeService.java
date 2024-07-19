package com.test.concepts.learn.spring.bean_scope.prototype_scope;

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
@Scope("prototype")
public class PrototypeService { // Cada vez que se solicita PrototypeService, se crea una nueva instancia del bean.

    public void serve(){
        System.out.println("Serving a prototype bean");
    }

}
