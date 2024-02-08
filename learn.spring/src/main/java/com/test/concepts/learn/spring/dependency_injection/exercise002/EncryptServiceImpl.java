package com.test.concepts.learn.spring.dependency_injection.exercise002;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.0.5
 * @since 21.0.0 2024-02-07
 */
@Getter
@Data
@NoArgsConstructor
@Component
public class EncryptServiceImpl implements EncryptService{

    private String password;
    private String key = "1234567890123456";

    @Override
    @SneakyThrows
    public String encrypt(String password) {
        SecretKey secretKey = new SecretKeySpec(this.key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptPassword = cipher.doFinal(password.getBytes());
        return Base64.getEncoder().encodeToString(encryptPassword);
    }

    @Override
    @SneakyThrows
    public String decrypt(String password) {
        byte[] passwordEncryptedBytes = Base64.getDecoder().decode(password);
        SecretKey secretKey = new SecretKeySpec(this.key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] passwordDecrypted = cipher.doFinal(passwordEncryptedBytes);
        return new String(passwordDecrypted);
    }
}
