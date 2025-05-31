package com.exercise.spring_security.auth.application.services;

import com.exercise.spring_security.auth.application.exception.UserException;
import com.exercise.spring_security.auth.domain.User;
import com.exercise.spring_security.auth.domain.UserErrorMessage;
import com.exercise.spring_security.auth.domain.UserRepository;
import com.exercise.spring_security.auth.domain.services.AuthService;
import com.exercise.spring_security.auth.application.dtos.*;

import com.exercise.spring_security.auth.domain.services.TokenService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Service
public class AuthServiceImpl implements AuthService, UserDetailsService {

  private final UserRepository userRepository;

  private final TokenService tokenService;

  private final PasswordEncoder passwordEncoder;

  private final AuthenticationConfiguration authenticationConfiguration;

  @Override
  public void createUser(final CreateUserDto createUserDto) {
    final User createUser = AuthMapper.fromDto(creatUserDto);
    createUser.setPassword(passwordEncoder.encode(creatUserDto.password()));
    userRepository.save(createUser);
  }

  @Override
  public User getUser(final UUID id) {
    return userRepository.findById(id)
        .orElseThrow(() -> new UserException(UserErrorMessage.USER_NOT_FOUND));
  }

  @Override
  public String login(final LoginRequestDto loginRequestDto) {
    try {
      final AuthenticationManager authenticationManager = authenticationConfiguration.getAuthenticationManager();
      final Authentication authRequest = AuthMapper.fromDto(loginRequestDto);
      final Authentication authentication = authenticationManager.authenticate(authRequest);
      return tokenService.generateToken(authentication);
    } catch (Exception e) {
      log.error("[USER] : Error while trying to login ", e);
      throw new RuntimeException("Error while trying to login");
    }
  }

  @Override
  public boolean validateToken(final String token) {
    return tokenService.validateToken(token);
  }

  @Override
  public String getUserFromToken(final String token) {
    return tokenService.getUserFromToken(token);
  }

  @Override
  public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
    log.info("[USER] : Loading user by email {}", username);
    return userRepository.findByEmail(username)
        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
  }
}
