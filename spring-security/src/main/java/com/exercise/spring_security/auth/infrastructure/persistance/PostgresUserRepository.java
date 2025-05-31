package com.exercise.spring_security.auth.infrastructure.persistance;

import com.exercise.spring_security.auth.domain.User;
import com.exercise.spring_security.auth.domain.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PostgresUserRepository extends JpaRepository<User, UUID>, UserRepository {
}
