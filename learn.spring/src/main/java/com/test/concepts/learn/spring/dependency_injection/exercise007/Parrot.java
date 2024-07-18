package com.test.concepts.learn.spring.dependency_injection.exercise007;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.1.3
 * @since 21.0.0 2024-07-18
 */
@Data
@NoArgsConstructor
@Component("Parrot")
public class Parrot implements SOForHacking {

    @Override
    public String name() {
        return "Parrot Security OS";
    }

    @Override
    public String description() {
        return "Parrot es otro sistema operativo basado en Debian que se enfoca en la seguridad y la privacidad. Ofrece una interfaz amigable y también incluye una gran cantidad de herramientas para auditorías de seguridad y pruebas de penetración.";
    }
}
