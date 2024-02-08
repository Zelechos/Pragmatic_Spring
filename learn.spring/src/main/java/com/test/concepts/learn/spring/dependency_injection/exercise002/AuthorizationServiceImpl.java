package com.test.concepts.learn.spring.dependency_injection.exercise002;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.0.5
 * @since 21.0.0 2024-02-07
 */
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class AuthorizationServiceImpl implements AuthorizationService{

    private UUID key;

    @Override
    public UUID generateKey() {
        this.key = UUID.randomUUID();
        return this.key;
    }

    @Override
    public void showKey() {
        System.out.println(this.getKey());
    }

    @Override
    public boolean validateAuth(UUID key) {
        return this.generateKey().equals(key);
    }
}
