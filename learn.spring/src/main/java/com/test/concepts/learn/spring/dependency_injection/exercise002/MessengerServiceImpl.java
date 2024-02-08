package com.test.concepts.learn.spring.dependency_injection.exercise002;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.0.5
 * @since 21.0.0 2024-02-07
 */
@Data
@NoArgsConstructor
@Getter
@Component
public class MessengerServiceImpl implements MessengerService{

    @Override
    public void send(String message, String sender, String adressee) {
        StringBuilder email  = new StringBuilder();
        email.append("Email : ").append(message).append("\n")
             .append("Sender : ").append(sender).append("\n")
             .append("Adressee : ").append(adressee).append("\n");
        System.out.println(email);
    }

    @Override
    public void delete() {
        System.out.println("Message has deleted");
    }

    @Override
    public void update() {
        System.out.println("Message has update");
    }
}
