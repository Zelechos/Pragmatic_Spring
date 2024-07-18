package com.test.concepts.learn.spring.basics;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@Service
public abstract class PaymentService {

    private double amount;
    private String paymentType;

    public double calculatePayment(double amount){
        return amount * Math.random();
    }

    public abstract String paymentInfo();
}
