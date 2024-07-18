package com.test.concepts.learn.spring.dependency_injection.exercise006;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.1.2
 * @since 21.0.0 2024-07-18
 */
@Data
@NoArgsConstructor
@Repository
public class OracleAccountRepository implements IOracle{

    private String user;
    private String password;

    @Override
    public OracleResponse save() {
        return OracleResponse.SAVE;
    }

    @Override
    public OracleResponse update() {
        return OracleResponse.UPDATE;
    }

    @Override
    public OracleResponse delete() {
        return OracleResponse.DELETE;
    }

    @Override
    public OracleResponse get() {
        return OracleResponse.GET;
    }

    @Override
    public String toString() {
        return "OracleAccountRepository{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
