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
@Component("PostgreSQL")
public class PostgreSql implements BDSystem{

    @Override
    public String name() {
        return "PostgreSQL";
    }

    @Override
    public String description() {
        return "PostgreSQL es un RDBMS de código abierto conocido por su robustez, extensibilidad y cumplimiento con el estándar SQL." +
                "Ofrece características avanzadas como transacciones ACID, vistas materializadas y funciones definidas por el usuario. ";
    }

    @Override
    public String use() {
        return "Adecuado para aplicaciones complejas que requieren operaciones transaccionales y un alto nivel de integridad de los datos.\n ";
    }
}
