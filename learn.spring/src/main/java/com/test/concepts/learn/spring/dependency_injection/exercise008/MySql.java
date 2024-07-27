package com.test.concepts.learn.spring.dependency_injection.exercise008;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.1.6
 * @since 21.0.0 2024-07-27
 */
@Data
@NoArgsConstructor
@Component("MySQL")
public class MySql implements BDSystem{

    @Override
    public String name() {
        return "MySQL";
    }

    @Override
    public String description() {
        return "MySQL es un sistema de gestión de bases de datos relacionales (RDBMS) de código abierto, " +
                "ampliamente utilizado en aplicaciones web. Es conocido por su velocidad, fiabilidad y facilidad de uso. ";
    }

    @Override
    public String use() {
        return "Comúnmente utilizado en aplicaciones web y en combinación con lenguajes de programación como PHP.";
    }
}
