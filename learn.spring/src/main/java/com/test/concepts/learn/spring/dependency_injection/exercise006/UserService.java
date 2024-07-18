package com.test.concepts.learn.spring.dependency_injection.exercise006;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.1.2
 * @since 21.0.0 2024-07-18
 */
@Data
@Service
public class UserService {

    private final OracleAccountRepository oracleAccountRepository;

    private final SecurityService securityService;

    @Autowired
    public UserService(OracleAccountRepository oracleAccountRepository, SecurityService securityService) {
        this.oracleAccountRepository = oracleAccountRepository;
        this.securityService = securityService;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "oracleAccountRepository=" + oracleAccountRepository +
                ", securityService=" + securityService.getSercurityInfo() +
                '}';
    }
}
