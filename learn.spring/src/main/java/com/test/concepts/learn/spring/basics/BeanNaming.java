package com.test.concepts.learn.spring.basics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Learn Basics about Bean Naming
 *
 * @author Alex T.H.
 * @version v0.1.2
 * @since 21.0.0 2024-07-18
 */
@Configuration
public class BeanNaming {

    //  Ahora este Bean tiene el nombre => PaymentServiceBean
    @Bean("PaymentServiceBean")
    public PaymentService paymentService(AccountRepository accountRepository){
        return new PaymentServiceImplement(accountRepository);
    }

    //  Por defecto este Bean tiene el nombre => accountRepositoryInjection
    @Bean
    public PaymentService accountRepositoryInjection(){
        AccountRepository accountRepository = null;
        return new PaymentServiceImplement(accountRepository);
    }
}
