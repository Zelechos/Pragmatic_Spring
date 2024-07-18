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
@Component("Kali")
public class Kali implements SOForHacking{

    @Override
    public String name() {
        return "Kali Linux";
    }

    @Override
    public String description() {
        return "Kali Linux es uno de los sistemas operativos más conocidos para hacking ético. Está basado en Debian y viene preinstalado con una amplia variedad de herramientas de seguridad, como escáneres de vulnerabilidades, herramientas de penetración, análisis forense y más.";
    }
}
