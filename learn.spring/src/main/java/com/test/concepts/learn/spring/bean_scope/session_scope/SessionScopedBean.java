package com.test.concepts.learn.spring.bean_scope.session_scope;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.1.5
 * @since 21.0.0 2024-02-18
 */
@Component
@SessionScope
public class SessionScopedBean {

    public void handleSession(){
        System.out.println("Handling session with a session-scoped Bean");
    }
}
