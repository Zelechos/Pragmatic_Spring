package com.test.concepts.learn.spring.bean_scope.request_scope;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.1.5
 * @since 21.0.0 2024-02-18
 */
@Component
@RequestScope
public class RequestScopedBean {

    public void handleRequest() {
        System.out.println("Handle request with a request-scoped bean");
    }

}
