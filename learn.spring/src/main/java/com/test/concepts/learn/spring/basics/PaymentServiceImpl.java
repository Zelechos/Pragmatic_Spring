package com.test.concepts.learn.spring.basics;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Learn Basics Concepts
 *
 * @author Alex T.H.
 * @version v0.1.1
 * @since 21.0.0 2024-07-16
 */
@Data
@Service
public class PaymentServiceImpl extends PaymentService implements AccountRepository {

    private double amount;
    private final AccountRepository accountRepository;

    public PaymentServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    public int accountNumber() {
        return 23049821;
    }

    @Override
    public String userName() {
        return "Hacker<I>Ether";
    }

    @Override
    public LocalDateTime creationDate() {
        return LocalDateTime.now();
    }

    @Override
    public String paymentInfo() {
        this.calculatePayment(amount);
        return this.toString();
    }
}
