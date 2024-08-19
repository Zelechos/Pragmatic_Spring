package com.test.concepts.learn.spring.bean_scope.websocket_scope;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.1.5
 * @since 21.0.0 2024-02-18
 */
@Data
@Component
@Scope(scopeName = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class WebSocketScopedBean {

    private int messageCount = 0;

    public void incrementMessageCount(){
        messageCount++;
    }

}
