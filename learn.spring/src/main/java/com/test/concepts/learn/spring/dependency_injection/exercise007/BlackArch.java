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
@Component("BlackArch")
public class BlackArch implements SOForHacking {

    @Override
    public String name() {
        return "BlackArch Linux";
    }

    @Override
    public String description() {
        return "BlackArch es una distribución basada en Arch Linux. Está diseñada específicamente para hackers éticos y contiene más de 2,000 herramientas de seguridad. Es ideal para usuarios avanzados que desean una amplia gama de opciones.";
    }
}
