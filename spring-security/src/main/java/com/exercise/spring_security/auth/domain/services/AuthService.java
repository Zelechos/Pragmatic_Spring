package com.exercise.spring_security.auth.domain.services;

import com.exercise.spring_security.auth.application.dtos.CreateUserDto;
import com.exercise.spring_security.auth.application.dtos.LoginRequestDto;
import com.exercise.spring_security.auth.domain.User;

import java.util.UUID;

public interface AuthService {

    String login(LoginRequestDto loginRequestDto);

    boolean validateToken(String token);

    String getUserFromToken(String token);

    void createUser(CreateUserDto createUserDto);

    User getUser(UUID id);

}
