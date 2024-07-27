package com.test.concepts.learn.spring.bean_scope.application_scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.1.6
 * @since 21.0.0 2024-07-27
 */
@RestController
@RequestMapping("/app")
public class ApplicationController {

    // Field Injections

    @Autowired
    private ApplicationScopedBean applicationScopedBean;

    @Autowired
    private User user;

    @Autowired
    private SessionService sessionService;

    @Autowired
    private SessionImpl session;

    @Autowired
    private StatusAppService statusAppService;

    @GetMapping("/increment")
    public String incrementCounter() {
        applicationScopedBean.incrementCounter();
        return "Counter => " + applicationScopedBean.getCounter();
    }


    @GetMapping("/user")
    public String getUser(){
        user.setUserId(UUID.randomUUID());
        user.setName("Alex");
        user.setLastName("Lancaster");
        user.setBornDate("23/01/2020");
        user.setPhone("74623521");
        session.setSessionInit(LocalDateTime.now());
        session.setSessionId(UUID.randomUUID());
        session.setUserIdSession(user.getUserId());
        session.setStatusSession(StatusSession.ACTIVE);
        user.setSession(session);
//        return "Session => " + sessionService.getInfoOfSession();
        return "User => " + user;
    }

    @GetMapping("/status")
    public String getStatusApp(){
//        statusAppService.setStatusApp(StatusApp.DEV);
        return "STATUS APP => " + statusAppService.getStatus();
    }

    @PostMapping("/status_change")
    public String changeStatusApp(@RequestParam("status") String status){
        if(StatusApp.QA.name().equals(status)){
            statusAppService.setStatusApp(StatusApp.QA);
        }
        if(StatusApp.DEV.name().equals(status)){
            statusAppService.setStatusApp(StatusApp.DEV);
        }
        if(StatusApp.PRODUCTION.name().equals(status)){
            statusAppService.setStatusApp(StatusApp.PRODUCTION);
        }
        return "Current Status App ["+status+"]";
    }
}
