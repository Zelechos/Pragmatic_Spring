package com.test.concepts.learn.spring.bean_scope.websocket_scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * Learn Bean Scope
 *
 * @author Alex T.H.
 * @version v0.1.7
 * @since 21.0.0 2024-08-19
 */
@Component
public class MyWebSocketHandler extends TextWebSocketHandler {

    @Autowired
    private WebSocketSessionData webSocketSessionData;

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        webSocketSessionData.setSession(session);
        webSocketSessionData.incrementMessageCount();
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        webSocketSessionData.incrementMessageCount();
        System.out.println("Message count for this session is => " + webSocketSessionData.getMessageCount());
        session.sendMessage(new TextMessage("Message count: " + webSocketSessionData.getMessageCount()));
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        System.out.println("[Session closed] : total messages send => " + webSocketSessionData.getMessageCount());
    }
}
