package com.test.concepts.learn.spring.dependency_injection.exercise007;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.1.2
 * @since 21.0.0 2024-07-18
 */
@Data
@NoArgsConstructor
@Component("Security")
public class Security implements SOForHacking{
    @Override
    public String name() {
        return "Security Onion";
    }

    @Override
    public String description() {
        return "Security Onion es una distribución basada en Ubuntu que se enfoca en la detección y análisis de intrusiones. Combina herramientas como Snort, Suricata y Wireshark para monitorear y proteger redes.";
    }
}
