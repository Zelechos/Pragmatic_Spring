package com.test.concepts.learn.spring.bean_scope.application_scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.1.5
 * @since 21.0.0 2024-02-18
 */
@RestController
@RequestMapping("/app")
public class ApplicationController {

    @Autowired
    private ApplicationScopedBean applicationScopedBean;

    @GetMapping("/increment")
    public String incrementCounter() {
        applicationScopedBean.incrementCounter();
        return "Counter => " + applicationScopedBean.getCounter();
    }
}
