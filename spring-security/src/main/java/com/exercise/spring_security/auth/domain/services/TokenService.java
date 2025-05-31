package com.exercise.spring_security.auth.domain.services;

import org.springframework.security.core.Authentication;

public interface TokenService {
    String generateToken(Authentication auth);

    boolean validateToken(String token);

    String getUserFromToken(String token);
}
