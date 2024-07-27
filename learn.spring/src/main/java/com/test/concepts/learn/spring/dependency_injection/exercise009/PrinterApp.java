package com.test.concepts.learn.spring.dependency_injection.exercise009;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
@Component
public class PrinterApp {

    private String name;
    private LocalDateTime runTime;
    private PrinterServices printer;

    @Autowired
    public PrinterApp(PrinterServices printer){
        this.name = printer.nameOfService();
        this.runTime = printer.executionTime();
        this.printer = printer;
    }

    @Override
    public String toString() {
        return "PrinterApp{" +
                "name='" + name + '\'' +
                ", runTime=" + runTime +
                '}';
    }
}
