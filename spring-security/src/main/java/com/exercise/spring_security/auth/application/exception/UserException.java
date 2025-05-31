package com.exercise.spring_security.auth.application.exception;

import com.exercise.spring_security.auth.domain.UserErrorMessage;

public class UserException extends RuntimeException {
    public UserException(UserErrorMessage message) {
        super(message.toString());
    }
}
