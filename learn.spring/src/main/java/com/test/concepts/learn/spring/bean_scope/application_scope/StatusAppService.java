package com.test.concepts.learn.spring.bean_scope.application_scope;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.1.6
 * @since 21.0.0 2024-07-27
 */
@Data
@NoArgsConstructor
@Service
@ApplicationScope
public class StatusAppService implements StatusService{

    private StatusApp statusApp;

    @Override
    public String getStatus() {
        return statusApp.name();
    }
}
