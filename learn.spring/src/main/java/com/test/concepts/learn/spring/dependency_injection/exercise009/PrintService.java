package com.test.concepts.learn.spring.dependency_injection.exercise009;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.1.6
 * @since 21.0.0 2024-07-27
 */
@Data
@NoArgsConstructor
@Service
@Primary
public class PrintService implements PrinterServices{

    @Override
    public String nameOfService() {
        return "[PRINT]";
    }

    @Override
    public LocalDateTime executionTime() {
        return LocalDateTime.now();
    }
}
