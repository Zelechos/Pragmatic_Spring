package com.test.concepts.learn.spring.dependency_injection.exercise006;

import lombok.Data;
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
public class SecurityService implements ISecurityStatusInformation {

    @Override
    public StatusInformation getSercurityInfo() {
        double attackProbability = calculateAttackProbability();
        if (attackProbability < 10) return StatusInformation.PROTECTED;
        if (attackProbability < 20 && attackProbability > 10) return StatusInformation.VIOLATED;
        if (attackProbability < 40 && attackProbability > 20) return StatusInformation.AT_RISK;
        if (calculateAttackProbability() > 50) return StatusInformation.ON_ATTACK;
        return StatusInformation.UNDEFINED;
    }

    @Override
    public double calculateAttackProbability() {
        int min = 1;
        int max = 100;
        return (int) (Math.random() * (max - min + 1)) + min;
    }

}
