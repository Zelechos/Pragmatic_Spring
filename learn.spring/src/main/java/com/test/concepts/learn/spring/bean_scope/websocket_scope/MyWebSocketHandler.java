package com.test.concepts.learn.spring.bean_scope.websocket_scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.1.5
 * @since 21.0.0 2024-02-18
 */
@Component
public class MyWebSocketHandler extends TextWebSocketHandler {

    @Autowired
    private WebSocketScopedBean webSocketScopedBean;

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        webSocketScopedBean.incrementMessageCount();
        session.sendMessage(new TextMessage("Message count: " + webSocketScopedBean.getMessageCount()));
    }
}
