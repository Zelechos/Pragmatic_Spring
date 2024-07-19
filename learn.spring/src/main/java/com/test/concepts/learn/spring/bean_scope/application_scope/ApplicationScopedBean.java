package com.test.concepts.learn.spring.bean_scope.application_scope;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.1.5
 * @since 21.0.0 2024-02-18
 */
@Data
@Component
@ApplicationScope
public class ApplicationScopedBean {

    private int counter = 0;

    public void incrementCounter() {
        counter++;
    }
}
