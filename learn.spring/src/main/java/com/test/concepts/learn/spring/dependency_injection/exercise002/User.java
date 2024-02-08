package com.test.concepts.learn.spring.dependency_injection.exercise002;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.0.5
 * @since 21.0.0 2024-02-07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    // Inyeccion de dependencias mediante fields
    @Autowired
    private AuthorizationService authorizationService;

    @Autowired
    private EncryptService encryptService;

    @Autowired
    private MessengerService messengerService;

}
