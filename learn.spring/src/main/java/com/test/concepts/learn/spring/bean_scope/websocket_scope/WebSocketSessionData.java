package com.test.concepts.learn.spring.bean_scope.websocket_scope;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketSession;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.1.7
 * @since 21.0.0 2024-08-19
 */
@Data
@Component
@Scope(scopeName = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class WebSocketSessionData {

    private WebSocketSession session;
    private int messageCount;

    public void incrementMessageCount(){
        this.messageCount++;
    }

}
