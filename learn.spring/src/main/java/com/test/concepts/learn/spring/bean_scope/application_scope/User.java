package com.test.concepts.learn.spring.bean_scope.application_scope;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.UUID;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.1.6
 * @since 21.0.0 2024-07-27
 */
@Data
@NoArgsConstructor
@Component
@ApplicationScope
public class User {

    private UUID userId;
    private String name;
    private String lastName;
    private String phone;
    private String bornDate;
    @Autowired
    private SessionImpl session;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", bornDate='" + bornDate + '\'' +
                ", session=" + session +
                '}';
    }
}
