package com.test.concepts.learn.spring.basics;

import java.time.LocalDateTime;

public interface AccountRepository {

    int accountNumber();

    String userName();

    LocalDateTime creationDate();
}
