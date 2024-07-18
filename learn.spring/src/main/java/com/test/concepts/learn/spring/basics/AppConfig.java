package com.test.concepts.learn.spring.basics;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Learn Basics Concepts
 *
 * @author Alex T.H.
 * @version v0.1.1
 * @since 21.0.0 2024-07-16
 */
@Configuration
public class AppConfig {

    @Bean
    public PaymentService paymentService(AccountRepository accountRepository){
        return new PaymentServiceImpl(accountRepository);
    }
}
