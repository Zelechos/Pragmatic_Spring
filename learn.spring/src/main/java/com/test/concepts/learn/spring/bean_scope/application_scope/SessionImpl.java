package com.test.concepts.learn.spring.bean_scope.application_scope;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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
@Service
public class SessionImpl implements SessionService {

    private UUID sessionId;

    private LocalDateTime sessionInit;

    private StatusSession statusSession;

    private UUID userIdSession;

    @Override
    public String getInfoOfSession() {
        return "SessionImpl{" +
                "sessionId=" + sessionId +
                ", sessionInit=" + sessionInit +
                ", statusSession=" + statusSession +
                ", userIdSession=" + userIdSession +
                '}';
    }

}
